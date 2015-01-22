/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Daniel
 */
public class Encriptacion {

//    private static String toHexadecimal(byte[] digest) {
//        String hash = "";
//        for (byte aux : digest) {
//            int b = aux & 0xff;
//            if (Integer.toHexString(b).length() == 1) {
//                hash += "0";
//            }
//            hash += Integer.toHexString(b);
//        }
//        return hash;
//    }
//
//    public static String encriptaMD5(String message) {
//        byte[] digest = null;
//        byte[] buffer = message.getBytes();
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            messageDigest.reset();
//            messageDigest.update(buffer);
//            digest = messageDigest.digest();
//        } catch (NoSuchAlgorithmException ex) {
//            System.out.println("Error creando Digest");
//        }
//        return toHexadecimal(digest);
//    }
//
//    public static String encriptaSHA256(String message) {
//        byte[] digest = null;
//        byte[] buffer = message.getBytes();
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//            messageDigest.reset();
//            messageDigest.update(buffer);
//            digest = messageDigest.digest();
//        } catch (NoSuchAlgorithmException ex) {
//            System.out.println("Error creando Digest");
//        }
//        return toHexadecimal(digest);
//    }
    
    public final static int ITERATION_NUMBER = 1000;

    public static byte[] getHash(int iterationNb, String password, byte[] salt) throws NoSuchAlgorithmException, Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        digest.reset();
        digest.update(salt);
        byte[] input = digest.digest(password.getBytes("UTF-8"));
        for (int i = 0; i < iterationNb; i++) {
            digest.reset();
            input = digest.digest(input);
        }
        return input;
    }

    public static String[] getDigestAndSalt(String unPassword) throws NoSuchAlgorithmException, Exception {
        String[] claves = new String[2];

        // Uses a secure Random not a simple Random
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        // Salt generation 64 bits long
        byte[] bSalt = new byte[8];
        random.nextBytes(bSalt);
        // Digest computation
        byte[] bDigest = getHash(ITERATION_NUMBER, unPassword, bSalt);
        String sDigest = byteToBase64(bDigest);
        String sSalt = byteToBase64(bSalt);

        claves[0] = sDigest;
        claves[1] = sSalt;
        return claves;
    }

    public static byte[] base64ToByte(String data) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        return decoder.decodeBuffer(data);
    }

    public static String byteToBase64(byte[] data) {
        BASE64Encoder endecoder = new BASE64Encoder();
        return endecoder.encode(data);
    }
}
