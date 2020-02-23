package sda.java.basics;

public class Palindrom {
   public static boolean checkPalindrome(String stringToCheck){
       boolean wart =false;
        char[] chars = stringToCheck.toCharArray();
        for (int i = 0; i< chars.length; i++ ){

            for (int j = chars.length; j>0; j--)
                if (chars[i]==chars[j]){
                        wart=true;
                }



            }
return wart;

    }
}

