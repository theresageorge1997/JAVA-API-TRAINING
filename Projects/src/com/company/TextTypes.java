package com.company;

public class TextTypes {
    public static void main(String args[]) {
        String message="I love Java" +"!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("J"));
        String message1="           I love Java" +"!!           ";
        System.out.println(message1);
        System.out.println(message1.trim());

        //escape sequence
        String path ="F:\\JAVA_TRAINING_UST\\Projects";
        System.out.println(path);

    }
}
