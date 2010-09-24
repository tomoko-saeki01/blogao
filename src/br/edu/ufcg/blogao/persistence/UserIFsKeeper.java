package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's users.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.user.UserIF;

import com.thoughtworks.xstream.XStream;

public class UserIFsKeeper {
	
	private final String SEP = System.getProperty("file.separator");
	private final String USERS_PARENT_PATH = "resources" + SEP + "db" + SEP + "users" + SEP;
	private final String USERS_FILE_EXTENSION = ".user";
	private final String EXISTENT_USER_MESSAGE = "Usu‡rio existente";
	private final String UNEXISTENT_USER_MESSAGE = "Usu‡rio inexistente";
	private XStream xstream = null;

	/**
	 * Default constructor.
	 */
	public UserIFsKeeper() {
		xstream = new XStream();
	}
	
	/**
	 * Delete all existing users.
	 */
	void deleteAllUsers() {
		File usersDirectory = new File(USERS_PARENT_PATH);
		usersDirectory.mkdirs();
		File[] usersFiles = usersDirectory.listFiles();
		for (File userFile : usersFiles) {
			userFile.delete();
			userFile.delete();
		}
	}

	/**
	 * Delete a specific user.
	 * @param userId The user's ID that will be deleted.
	 * @throws Exception If the user doesn't exist in database.
	 */
	void deleteUser(String userId) throws Exception {
		if (!existsUserInDatabase(userId)) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		File file = new File(USERS_PARENT_PATH + userId + USERS_FILE_EXTENSION);
		file.setWritable(true, true);
		file.delete();
	}

	/**
	 * Verify if a specific user exist.
	 * @param id The user's ID that will be verified.
	 * @return True case the user exist or False otherwise.
	 */
	boolean existsUserInDatabase(String id) {
		return (new File(USERS_PARENT_PATH + id + USERS_FILE_EXTENSION)).exists();
	}

	/**
	 * Return a map with all existing users.
	 * @return A map with all users.
	 */
	Map<String, UserIF> getAllUsers() {
		File usersDirectory = new File(USERS_PARENT_PATH);
		usersDirectory.mkdirs();
		FileReader reader = null;
		File[] usersFiles = usersDirectory.listFiles();
		Map<String, UserIF> users = new HashMap<String, UserIF>();
		for (File userFile : usersFiles) {
			if (userFile.getName().endsWith(USERS_FILE_EXTENSION)) {
				try {
					reader = new FileReader(userFile);
					UserIF user = (UserIF) xstream.fromXML(reader);
					users.put(user.getId(), user);
					reader.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}

	/**
	 * Insert a new user.
	 * @param user The user that will be inserted.
	 * @throws Exception If the user already exist in database.
	 */
	void insertUser(UserIF user) throws Exception {
		if (existsUserInDatabase(user.getId())) {
			throw new IllegalStateException(EXISTENT_USER_MESSAGE);
		}
		File directoryStructure = new File(USERS_PARENT_PATH);
		directoryStructure.mkdirs();
		FileWriter writer = new FileWriter(new File(USERS_PARENT_PATH + user.getId() + USERS_FILE_EXTENSION));
		xstream.toXML(user, writer);
		writer.close();
	}
	
	/**
	 * Return a list with all user's ID.
	 * @return A list with all user's ID.
	 */
	public List<String> listUsersInDatabase() {
		File usersDirectory = new File(USERS_PARENT_PATH);
		usersDirectory.mkdirs();
		File[] usersFiles = usersDirectory.listFiles();
		List<String> usersIds = new ArrayList<String>();
		for (File userFile : usersFiles) {
			String userFileName = userFile.getName();
			usersIds.add(userFileName.substring(0, userFileName.length() - USERS_FILE_EXTENSION.length()));
		}
		return usersIds;
	}
	
	/**
	 * Retrieve a specific user.
	 * @param userId The user's ID that will be retrieved.
	 * @return The user.
	 * @throws Exception If the user doesn't exist.
	 */
	UserIF retrieveUser(String userId) throws Exception {
		if (!existsUserInDatabase(userId)) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		FileReader reader = new FileReader(new File(USERS_PARENT_PATH + userId + USERS_FILE_EXTENSION));
		UserIF user = (UserIF) xstream.fromXML(reader);
		reader.close();
		return user;
	}
	
	/**
	 * Update the user.
	 * @param user The user that will be updated.
	 * @throws Exception If the user doesn't exist in database.
	 */
	void updateUser(UserIF user) throws Exception {
		if (!existsUserInDatabase(user.getId())) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		FileWriter writer = new FileWriter(new File(USERS_PARENT_PATH + user.getId() + USERS_FILE_EXTENSION));
		xstream.toXML(user, writer);
		writer.close();
	}
}