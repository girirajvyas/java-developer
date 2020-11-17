package io.girirajvyas.utilities;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

public class UnlimitedCrypographyEnabledCheck {

	public static void main(String[] args) {
		System.out.println("unlimited cryptography enabled is: " + isUnlimitedCryptographyEnabled());
	}

	public static Boolean isUnlimitedCryptographyEnabled() {
		try {
			int length = Cipher.getMaxAllowedKeyLength("AES");
			// 128 is the limited crypto length and Tnteger.max_value is
			// unlimited

			boolean unlimited = (length == Integer.MAX_VALUE);
			return unlimited;

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return false;
	}
}
