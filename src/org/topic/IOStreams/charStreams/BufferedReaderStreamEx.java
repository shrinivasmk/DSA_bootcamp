package org.topic.IOStreams.charStreams;

import java.io.*;

public class BufferedReaderStreamEx {
    public static void main(String[] args) {
        try{
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println(br.readLine());

            BufferedReader br = new BufferedReader(new FileReader("/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/charStreams/TextFiles/BufferedReaderTextFile.txt"));
            while(br.ready()){
                System.out.println(br.readLine());
            }


        } catch (IOException ex){
            ex.getMessage();
        }
    }
}
