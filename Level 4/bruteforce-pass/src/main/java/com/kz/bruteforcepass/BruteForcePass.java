package com.kz.bruteforcepass;

public class BruteForcePass {
    public static String hashPass(String password) {
        int code = password.hashCode();
        String hashed = Integer.toString(code);
        return hashed;
    }

    public static String allowedChars = "0123456789";
    public static String pass = "";

    public static String bruteforcePass(String hashedPass) {
        // Write your code here
        return "";
    }
}
