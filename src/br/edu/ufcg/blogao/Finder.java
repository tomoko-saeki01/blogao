package br.edu.ufcg.blogao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.ufcg.blogao.blog.Blog;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.user.Sex;
import br.edu.ufcg.blogao.user.UserIF;
import br.edu.ufcg.blogao.user.UsersHandler;

/** 
 * 
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 */
public class Finder {
	
	DatabaseFacade dbFacade = DatabaseFacade.getInstance();
	
	public List<String> findBlogsWithName(String match) {
		List<String> result = new ArrayList<String>();
		if (isInvalidString(match)) {
			return result;
		}
		try {
			for (String blogId : dbFacade.listBlogsInDatabase()) {
				Blog blog = dbFacade.retrieveBlog(blogId);
				String searchedName = blog.getTitle().getText();
				if (searchedName.toLowerCase().contains(match.toLowerCase())) {
					result.add(blog.getId());
				}
			}
		} catch (Exception e) {
			return result;
		}
		return result;
	}
	

	public List<String> findUsersWithName(String match) {
		List<String> result = new ArrayList<String>();
		if (isInvalidString(match)) {
			return result;
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
		} catch (Exception e) {
			return result;
		}
		return sortList(result);
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().equals("");
	}

	public List<String> findUsersWithInterests(String match) {
		List<String> result = new ArrayList<String>();
		if (isInvalidString(match)) {
			return result;
		}
		try {
			for (String userId : dbFacade.listUsersInDatabase()) {
				UserIF user = dbFacade.retrieveUser(userId);
				String searchedInterests = user.getInterests();
				if (searchedInterests.toLowerCase().contains(match.toLowerCase())) {
					result.add(user.getId());
				}
			}
		} catch (Exception e) {
			return result;
		}
		return sortList(result);
	}

	public List<String> findUsersWithGender(String match) {
		List<String> result = new ArrayList<String>();
		final String UNINFORMED_SEX = UsersHandler.getInstance().convertSexToStringSex(Sex.Uninformed);
		if (isInvalidString(match)) {
			return result;
		}
		try {
			List<String> usersId = dbFacade.listUsersInDatabase();
			if (match.equals(UNINFORMED_SEX)) {
				return sortList(usersId);
			}
			for (String userId : usersId) {
				UserIF user = dbFacade.retrieveUser(userId);
				String searchedSex = UsersHandler.getInstance().convertSexToStringSex(user.getSex());
				if (searchedSex.toLowerCase().contains(match.toLowerCase())) {
					result.add(user.getId());
				}
				
			}
		} catch (Exception e) {
			return result;
		}
		return sortList(result);
	}
	
	
	
	private List<String> sortList(List<String> list) {
		String[] array = list.toArray(new String[0]);
		Arrays.sort(array);
		list.clear();
		for (String str : array) {
			list.add(str);
		}
		return list;
	}
	
}