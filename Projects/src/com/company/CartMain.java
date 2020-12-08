package com.company;

import java.util.Scanner;

public class CartMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cart=0;
        byte item;
        do {
            System.out.println("Enter a products to cart: \n 1. PEN - Rs.100 \n 2.Pencil - Rs.10 \n 3.T-shirt- Rs.1700 \n 4. quit");
            item = sc.nextByte();
            switch (item) {
                case 1 -> {
                    System.out.println(" PEN - Rs.100 added to cart");
                    cart = cart + 100;
                    System.out.println(cart);
                }
                case 2 -> {
                    System.out.println("Pencil - Rs.10 added to cart");
                    System.out.println(cart);
                }
                case 3 -> {
                    System.out.println("T-shirt- Rs.1700 added to cart");
                    System.out.println(cart);
                }
                case 4 -> System.out.println("Thursday added to cart");
            }
        } while (item != 4);

        }
    }

