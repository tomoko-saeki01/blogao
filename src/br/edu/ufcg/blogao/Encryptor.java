package br.edu.ufcg.blogao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Encryptor {
	
	private static final String ENCRYPT_ALGORITHM = "MD5";
	private Encryptor() {
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
	
	public static String randomIntEncrypt(int i) {
		return randomIntEncrypt(String.valueOf(i));
	}
	
	public static String randomIntEncrypt(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance(ENCRYPT_ALGORITHM);
			md.update(str.getBytes());
			return cutAQuarterString(encryptToIntegers(encrypt(str)));
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
	
	private static String encryptToIntegers(String str) {
		final String VALUE_OF_A = "3";
		final String VALUE_OF_B = "1";
		final String VALUE_OF_C = "9";
		final String VALUE_OF_D = "0";
		final String VALUE_OF_E = "7";
		final String VALUE_OF_F = "6";
		
		str = str.replaceAll("A", VALUE_OF_A);
		str = str.replaceAll("B", VALUE_OF_B);
		str = str.replaceAll("C", VALUE_OF_C);
		str = str.replaceAll("D", VALUE_OF_D);
		str = str.replaceAll("E", VALUE_OF_E);
		str = str.replaceAll("F", VALUE_OF_F);
		return str;
	}
	
	private static String cutAQuarterString(String str) {
		final int MAXIMUM_START_INDEX = (3*(str.length())) / 4;
		int startIndex = (new Random()).nextInt(MAXIMUM_START_INDEX);
		// Special case: cut str starts with '0'. (Has to be changed)
		while (str.charAt(startIndex) == '0' && startIndex > 0) {
			startIndex--;
		}
		// Special case: starIndex == 0 and str starts with '0'.
		while (str.charAt(startIndex) == '0' && startIndex <= MAXIMUM_START_INDEX) {
			startIndex++;
		}
		final int endIndex = startIndex + str.length()/4;
		return str.substring(startIndex, endIndex);
	}

}
