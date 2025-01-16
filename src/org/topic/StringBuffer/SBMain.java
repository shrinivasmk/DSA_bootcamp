package org.topic.StringBuffer;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class SBMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Shrinivas");
        sb.append(" Killedar");
        System.out.println(sb);
        String randomString  = randomString(25);
        System.out.println(randomString);

        sb.insert(3,"hey");
        System.out.println(sb);

        StringBuffer sb2  = new StringBuffer(25);
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("nakkan");
        System.out.println(sb3.capacity());

        sb.append(2);
        sb.append('d');
        sb.reverse();
        System.out.println(sb);

        String sequence = "asfd   asfd  asf   asf  asf  a sd";
        System.out.println(sequence.replaceAll("\\s",""));
        System.out.println(Arrays.toString(sequence.split(" ")));
    }

    public static String randomString(int size){
        StringBuffer sb = new StringBuffer();
        Random random =  new Random();

        for(int i = 0; i < size; i++){
            int randomChar = 97 + (int) (random.nextFloat() * 26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}
