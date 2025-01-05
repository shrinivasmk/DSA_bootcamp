package org.algoExpert.strings;

public class CaeserCipherEncryptor {
    public static void main(String[] args) {
        String str = "xyz";
        System.out.println(convert(str,2));
    }

    public static String convert(String str, int key){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length();i++){
            int ascii_val = str.charAt(i) + (key%26);
            if(ascii_val > 'z'){
                ascii_val -= 26;
            }
            sb.append((char)ascii_val);
        }
        return sb.toString();
    }
}
