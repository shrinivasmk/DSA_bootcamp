package org.practice.linearSearch;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Shrinivas";
        char target = 'z';

        System.out.println(search(name,target));
        System.out.println(search2(name,target));
        System.out.println(search3(name,target));

//        char[] strArray = name.toCharArray();
//        System.out.println(Arrays.toString(strArray));

    }

    //return the index of the character
    static int search(String str, char target){
        if(str.length() == 0 ){
            return -1;
        }

        for (int i =0;i<str.length();i++){
            if(str.charAt(i)== target){
                return i;
            }
        }
        return -1;
    }

    //returns the character if exists
    static char search2(String str, char target){
        if(str.length() == 0 ){
            return '$';
        }

        for (int i =0;i<str.length();i++){
            if(str.charAt(i)== target){
                return str.charAt(i);
            }
        }
        return '$';
    }


    //returns boolean value
    static boolean search3(String str, char target){
        if(str.length() == 0 ){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
