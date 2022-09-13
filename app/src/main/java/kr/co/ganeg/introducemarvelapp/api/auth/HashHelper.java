package kr.co.ganeg.introducemarvelapp.api.auth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class HashHelper {

    static String generate(String s) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] digest = messageDigest.digest(s.getBytes());
            StringBuilder md5 = new StringBuilder();
            for (byte value : digest) {
                md5.append(Integer.toHexString((value & 0xFF) | 0x100).substring(1, 3));
            }
            return md5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}