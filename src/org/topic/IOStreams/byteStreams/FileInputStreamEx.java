package org.topic.IOStreams.byteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        String fileName = "/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/byteStreams/textFiles/FileInputStreamTextFile.txt";
        String outputFile = "/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/byteStreams/textFiles/FileOutputStreamTextFile.txt";
        try (FileInputStream fis = new FileInputStream(fileName)){
            FileOutputStream fos = new FileOutputStream(outputFile);

            int data;
            while((data = fis.read()) != -1){
                fos.write((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
