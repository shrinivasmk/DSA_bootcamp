package org.topic.IOStreams.charStreams;

import java.io.*;

public class BufferedWriterStreamEx {
    public static void main(String[] args) {
//        try(BufferedReader br = new BufferedReader(new FileReader("/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/charStreams/TextFiles/BufferedReaderTextFile.txt"))){
//            StringBuilder sb = new StringBuilder();
//            sb.append(br.readLine());
//            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/charStreams/TextFiles/BufferedWriterTextFile.txt"));
//            bw.write("Hello");
//            bw.newLine();
//            bw.write("boss");
//            bw.newLine();
//            bw.write(sb.toString());
//            bw.flush();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            FileWriter fileWriter = new FileWriter("/Users/shrinivaskilledar/Documents/WorkSpace/DSA_bootcamp/src/org/topic/IOStreams/charStreams/TextFiles/BufferedWriterTextFile.txt");
            fileWriter.write("Hello");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
