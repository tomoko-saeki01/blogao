package br.edu.ufcg.blogao;

/**   
 * Find users and blog on Blogao.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import br.edu.ufcg.blogao.blog.Blog;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.user.Sex;
import br.edu.ufcg.blogao.user.UserIF;
import br.edu.ufcg.blogao.user.UsersHandler;

public class Finder {
	
	DatabaseFacade dbFacade = DatabaseFacade.getInstance();
	private final String INCORRECT_FORMAT = ", ";
	private final String CORRECT_FORMAT = ",";
	
	/**
	 * Find all the blogs with the name passed as parameter.
	 * @param match The name.
	 * @return All the blogs with the specific name.
	 */
	public String findBlogsWithName(String match) {
		List<Blog> result = new ArrayList<Blog>();
		if (isInvalidString(match)) {
			return result.toString();
		}
		try {
			for (String blogId : dbFacade.listBlogsInDatabase()) {
				Blog blog = dbFacade.retrieveBlog(blogId);
				String searchedName = blog.getTitle().getText();
				if (searchedName.toLowerCase().contains(match.toLowerCase())) {
					result = insertBlogSortingByCreationDate(result.iterator(), blog);
				}
			}
		} catch (Exception e) {
		}
		return convertBlogListToIdList(result.iterator()).toString().replaceAll(INCORRECT_FORMAT, CORRECT_FORMAT);
	}

	/**
	 * Find all the users with the gender passed as parameter.
	 * @param match The gender.
	 * @return All the user's with the specific gender.
	 */
	public String findUsersWithGender(String match) {
		List<String> result = new ArrayList<String>();
		final String UNINFORMED_SEX = UsersHandler.getInstance().convertSexToStringSex(Sex.Uninformed);
		if (isInvalidString(match)) {
			return result.toString();
		}
		try {
			List<String> usersId = dbFacade.listUsersInDatabase();
			if (match.equals(UNINFORMED_SEX)) {
				return sortList(usersId.iterator()).toString().replaceAll(INCORRECT_FORMAT, CORRECT_FORMAT);
			}
			for (String userId : usersId) {
				UserIF user = dbFacade.retrieveUser(userId);
				String searchedSex = UsersHandler.getInstance().convertSexToStringSex(user.getSex());
				if (searchedSex.toLowerCase().contains(match.toLowerCase())) {
					result.add(user.getId());
				}
			}
		} catch (Exception e) {}
		return sortList(result.iterator()).toString().replaceAll(INCORRECT_FORMAT, CORRECT_FORMAT);
	}
	
	/**
	 * Find all the users with the interests passed as parameter.
	 * @param match The interests.
	 * @return All users with the specific interests.
	 */
	public String findUsersWithInterests(String match) {
		List<String> result = new ArrayList<String>();
		if (isInvalidString(match)) {
			return result.toString();
		}
		try {
			for (String userId : dbFacade.listUsersInDatabase()) {
				UserIF user = dbFacade.retrieveUser(userId);
				String searchedInterests = user.getInterests();
				if (searchedInterests.toLowerCase().contains(match.toLowerCase())) {
					result.add(user.getId());
				}
			}
		} catch (Exception e) {}
		return sortList(result.iterator()).toString().replaceAll(INCORRECT_FORMAT, CORRECT_FORMAT);
	}

	/**
	 * Find all the users with the name passed as parameter.
	 * @param match The name.
	 * @return All users with the specific name.
	 */
	public String findUsersWithName(String match) {
		List<String> result = new ArrayList<String>();
		if (isInvalidString(match)) {
			return result.toString();
		}
		try {
			for (String userId : dbFacade.listUsersInDatabase()) {
				UserIF user = dbFacade.retrieveUser(userId);
				String searchedName = user.getName();
				if (isInvalidString(searchedName)) {
					searchedName = user.getId(); //login
				}
				if (searchedName.toLowerCase().contains(match.toLowerCase())) {
					result.add(user.getId());
				}
			}
		} catch (Exception e) {}
		return sortList(result.iterator()).toString().replaceAll(INCORRECT_FORMAT, CORRECT_FORMAT);
	}
	
	/**
	 * Convert a list with blogs to a list with the blog's ID.
	 * @param blogList The list that will be converted.
	 * @return The list contain the blog's ID.
	 */
	private List<String> convertBlogListToIdList(Iterator<Blog> blogList) {
		List<String> idList = new ArrayList<String>();
		while (blogList.hasNext()) {
			idList.add(blogList.next().getId());
		}
		return idList;
	}
	/*private List<String> convertBlogListToIdList(List<Blog> blogList) {
		List<String> idList = new ArrayList<String>();
		for (Blog blog : blogList) {
			idList.add(blog.getId());
		}
		return idList;
	} */
		
	/**
	 * Insert a blog, in a list, in order according to the creation date.
	 * @param blogs The list where the new blog will be inserted.
	 * @param newBlog The blog that will be inserted.
	 * @return The list sorted.
	 */
	private List<Blog> insertBlogSortingByCreationDate(Iterator<Blog> blogs, Blog newBlog) {
		List<Blog> blogsList = new ArrayList<Blog>();		
		while (blogs.hasNext()) {
			blogsList.add(blogs.next());
		}	
		
		int i = 0;
		while (blogs.hasNext()) {
			i++;
			if (blogs.next().getCreationDate().after(newBlog.getCreationDate())) {
				break;
			}
		}
		blogsList.add(i, newBlog);
		return blogsList;
	}
	/*private List<Blog> insertBlogSortingByCreationDate(List<Blog> blogs, Blog newBlog) {
		int i;
		for (i = 0; i < blogs.size(); i++) {
			if (blogs.get(i).getCreationDate().after(newBlog.getCreationDate())) {
				break;
			}
		}
		blogs.add(i, newBlog);
		return blogs;
	} */
	
	/**
	 * Verify if the string is invalid.
	 * @param str The string that will be verified.
	 * @return
	 */
	private boolean isInvalidString(String str) {
		return str == null || str.trim().equals("");
	}

	/**
	 * Sort a list.
	 * @param list The list that will be sorted.
	 * @return A sorted list.
	 */
	private List<String> sortList(Iterator<String> list) {
		List<String> newList = new ArrayList<String>();		
		while (list.hasNext()) {
			newList.add(list.next());
		}	
		String[] array = newList.toArray(new String[0]);
		
		Arrays.sort(array);
		newList.clear();
		for (String str : array) {
			newList.add(str);
		}
		return newList;
	}
	/*private List<String> sortList(List<String> list) {
		String[] array = list.toArray(new String[0]);
		Arrays.sort(array);
		list.clear();
		for (String str : array) {
			list.add(str);
		}
		return list;
	}*/
}