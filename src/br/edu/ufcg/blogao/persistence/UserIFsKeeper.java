package br.edu.ufcg.blogao.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.user.UserIF;

import com.thoughtworks.xstream.XStream;

public class UserIFsKeeper {
	
	private final String SEP = System.getProperty("file.separator");
	private final String USERS_PARENT_PATH = "resources" + SEP + "db" + SEP + "users" + SEP;
	private final String USERS_FILE_EXTENSION = ".usr";
	private final String EXISTENT_USER_MESSAGE = "Usu‡rio existente";
	private final String UNEXISTENT_USER_MESSAGE = "Usu‡rio inexistente";
	
	private XStream xstream = null;
	
	public UserIFsKeeper() {
		xstream = new XStream();
	}
	
	void insertUser(UserIF user) throws Exception {
		if (existsUserInDatabase(user.getId())) {
			throw new IllegalStateException(EXISTENT_USER_MESSAGE);
		}
		File directoryStructure = new File(USERS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(USERS_PARENT_PATH + user.getId() + USERS_FILE_EXTENSION);
		xstream.toXML(user, new FileOutputStream(file));
	}
	
	UserIF retrieveUser(String userId) throws Exception {
		if (!existsUserInDatabase(userId)) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		File file = new File(USERS_PARENT_PATH + userId + USERS_FILE_EXTENSION);
		return (UserIF) xstream.fromXML(new FileInputStream(file));
	}
	
	void updateUser(UserIF user) throws Exception {
		if (!existsUserInDatabase(user.getId())) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		File file = new File(USERS_PARENT_PATH + user.getId() + USERS_FILE_EXTENSION);
		xstream.toXML(user, new FileOutputStream(file));
	}
	
	void deleteUser(String userId) throws Exception {
		if (!existsUserInDatabase(userId)) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		new File(USERS_PARENT_PATH + userId + USERS_FILE_EXTENSION).delete();
	}
	
	void deleteAllUsers() {
		File usersDirectory = new File(USERS_PARENT_PATH);
		usersDirectory.mkdirs();
		File[] usersFiles = usersDirectory.listFiles();
		for (File userFile : usersFiles) {
			userFile.delete();
		}
	}
	
	Map<String, UserIF> getAllUsers() {
		File usersDirectory = new File(USERS_PARENT_PATH);
		usersDirectory.mkdirs();
		File[] usersFiles = usersDirectory.listFiles();
		Map<String, UserIF> users = new HashMap<String, UserIF>();
		for (File userFile : usersFiles) {
			if (userFile.getName().endsWith(USERS_FILE_EXTENSION)) {
				try {
					UserIF user = (UserIF) xstream.fromXML(new FileInputStream(userFile));
					users.put(user.getId(), user);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}

	boolean existsUserInDatabase(String id) {
		return (new File(USERS_PARENT_PATH + id + USERS_FILE_EXTENSION)).exists();
	}

}
