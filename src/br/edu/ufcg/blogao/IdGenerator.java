package br.edu.ufcg.blogao;

/**
 * Generate a unique ID.
 *  
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IdGenerator {
	
	private static IdGenerator selfInstance = null;
	private final String ID_BACKUP_FILE = "resources" + System.getProperty("file.separator") + ".id";  
	private static int nextId = 0;
	
	private IdGenerator() {
	}

	/**
	 * Return the instance of IdGenerator.
	 * @return The instance of IdGenerator.
	 */
	public synchronized static IdGenerator getInstance() {
		if (selfInstance == null) {
			selfInstance = new IdGenerator();
		}
		return selfInstance;
	}
	
	/**
	 * Return the next ID.
	 * @return The next ID.
	 */
	public synchronized String getNextId() {
		if (nextId == 0) {
			nextId = retriveBackupId();
		}
		saveBackupId(++nextId);
		return Encryptor.randomIntEncrypt(nextId);
	}

	private void saveBackupId(int i) {
	
		FileWriter writer;
		try {
			writer = new FileWriter(new File(ID_BACKUP_FILE));
			writer.write(String.valueOf(i));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * This method is incomplete.
	 */
	private int retriveBackupId() {
		File idBackupFile = new File(ID_BACKUP_FILE);
		BufferedReader reader = null;
		String value = "";
		try {
			reader = new BufferedReader(new FileReader(idBackupFile)); 
			value = reader.readLine();
		} catch (FileNotFoundException e) {
			System.err.println("ID backup File Corrupted! Blogao is creating a new ID primary key...");
			// TODO We need to decide how to regenerate a valid ID.
			saveBackupId(nextId);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		if (value.matches("[0-9]*")) {
			return Integer.parseInt(value);
		}
		return 0;
	}
}