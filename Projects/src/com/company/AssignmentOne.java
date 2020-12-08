package com.company;

import java.util.Scanner;

public class AssignmentOne {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        final int NUMBER =sc.nextInt();

        if(NUMBER%5 == 0)
            System.out.println("spring");
        else if(NUMBER%3 == 0)
            System.out.println("boot");
        else
            System.out.println(NUMBER);

    }
}
