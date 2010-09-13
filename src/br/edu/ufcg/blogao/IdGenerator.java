package br.edu.ufcg.blogao;

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

	public synchronized static IdGenerator getInstance() {
		if (selfInstance == null) {
			selfInstance = new IdGenerator();
		}
		return selfInstance;
	}
	
	public synchronized String getNextId() {
		if (nextId == 0) {
			nextId = retriveBackupId();
		}
		saveBackupId(++nextId);
		return Encryptor.encrypt(nextId);
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
			System.out.println(value);
		} catch (FileNotFoundException e) {
			System.err.println("ID backup File Corrupted! Blogao is creating a new ID primary key...");
			// TODO We need to decide how to regenerate a valid ID.
			saveBackupId(nextId);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					System.out.println("AQQUI");
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
