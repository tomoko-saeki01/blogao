package br.edu.ufcg.blogao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryptor {
	
	private static final String ENCRYPT_ALGORITHM = "MD5";
	private Encryptor() {
	}
	
	public static String encrypt(int i) {
		try {
			MessageDigest md = MessageDigest.getInstance(ENCRYPT_ALGORITHM);
			md.update(String.valueOf(i).getBytes());
			return new String(hexCodes(md.digest()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String encrypt(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance(ENCRYPT_ALGORITHM);
			md.update(str.getBytes());
			return new String(hexCodes(md.digest()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;
 
        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                                    hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
    }

}
