package org.topic.string;

public class Performance {
    public static void main(String[] args) {
        String out = "";
        //char ch = 'a';
        for (int i = 0;i<26;i++){
            char ch =  (char) ('a' + i);
            out = out + ch;
        }
        System.out.println(out);
    }
}
