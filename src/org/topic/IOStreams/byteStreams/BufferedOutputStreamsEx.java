package org.topic.IOStreams.byteStreams;

import java.io.*;

public class BufferedOutputStreamsEx {
    public static void main(String[] args) {


         //Writing in console

        try(BufferedOutputStream bos = new BufferedOutputStream(System.out)){
            String sentence = "Printing in console using BufferedOutputStream";

            // without using bytes
//            int data;
//            for(int i = 0; i< sentence.length(); i++){
//                data = sentence.charAt(i);
//                bos.write(data);
//            }
//            System.out.println();

            // by converting to bytes

            byte[] bytes = sentence.getBytes();
            bos.write(bytes);
            bos.flush();
        } catch (IOException ex){
            ex.getMessage();
        }




        // Writing in files

        String sourceFilePath = "/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/byteStreams/textFiles/BufferedInputStringFile.txt";
        String destinationFilePath = "/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/byteStreams/textFiles/BufferedOutputFile.txt";
        try(BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream(destinationFilePath))){
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFilePath));
            StringBuilder sourceString = new StringBuilder();
            int data;
            while ((data = bis.read()) != -1){
                sourceString.append((char)data);
            }
            String str = sourceString.toString();
            byte[] bytes = str.getBytes();
            bos1.write(bytes);
            bos1.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
