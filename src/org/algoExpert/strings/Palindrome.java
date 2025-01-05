package org.algoExpert.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "ababa";
        String str2 = "";
        String str3 = null;
        String str4 = "aaaalb";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));

    }

    //2 pointers method
    public static boolean isPalindrome(String str){

        if(str == null || str.isEmpty()){
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    // two pointers
    public static boolean isPalindrome3(String str) {
        // Write your code here.
        int start = 0;
        int end = str.length()-1;
        for(int i =0 ;i<str.length() /2 ; i++){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }


    //by reversing the string
    public static boolean isPalindrome2(String str) {
        // Write your code here.

        String str2 = "";
        for (int i =0 ;i<str.length();i++){
            str2 = str.charAt(i)+str2;
        }

        if(str2.equals(str)){
            return true;
        }
        else if(str.length()<1){
            return true;
        }
        return false;
    }
}
