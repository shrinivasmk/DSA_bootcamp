package org.topic.IOStreams.byteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamsEx {
    public static void main(String[] args) {
//        try {
//            BufferedInputStream bis = new BufferedInputStream(System.in,500);
//
//            StringBuilder sb = new StringBuilder();
//            int letters;
//            while((letters = bis.read()) != -1){
//                char ch = (char) letters;
//
//                sb.append(ch);
//
////                if(sb.toString().endsWith("end\n")){
////                    break;
////                }
//            }
//            System.out.println(sb);
//
//
//        } catch (IOException ex){
//            ex.getMessage();
//        }

        String inputFilePath = "/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/byteStreams/textFiles/BufferedInputStringFile.txt";

        try(java.io.BufferedInputStream bis = new java.io.BufferedInputStream(new FileInputStream(inputFilePath))){
            int data;
            while((data = bis.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }


    }
}
