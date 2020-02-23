package sda.java.basics;

public class Palindrom {


    public static boolean checkPalindrome(String stringToCheck) {

        stringToCheck = StringUtils.prepareString(stringToCheck);

        boolean wart = true;
        char[] chars = stringToCheck.toCharArray();
        for (int i = 0, j = ((chars.length) - 1); i < ((chars.length) - 1) && j > 0; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }

        }
        return true;
    }

}

