package org.topic.IOStreams.byteStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

//            System.out.println(in.available());
//
            BufferedInputStream bis = new BufferedInputStream(System.in,500);
            BufferedOutputStream bos = new BufferedOutputStream(System.out);

            StringBuilder sb = new StringBuilder();
            int letters;
            while((letters = bis.read()) != -1){
                char ch = (char) letters;

                sb.append(ch);

//                if(sb.toString().endsWith("end\n")){
//                    break;
//                }
            }
            //System.out.print("Enter Your name :" + (char) letters );
            System.out.println(sb);

//            BufferedOutputStream bos = new BufferedOutputStream(System.out);
//            bos.write(97);

        } catch (IOException ex){
            ex.getMessage();
        }

    }

}
