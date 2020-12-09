package com.ecommerce;

import java.util.List;
import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);


    public static double readNumber( String prompt, double min, double max ) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " to " + max);
        }
        return value;
    }

    public static int readNumber( String prompt, int min, int max ) {
        int value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " to " + max);
        }
        return value;
    }


    public static String readTitle( String prompt ) {
        List<Product> products = List.of(
                new Product("Pen","Lexi",10605.5,2),
                new Product("Pencil","Lexi",12005.5,1),
                new Product("Book","Lexi",20005.5,3),
                new Product("Phone","Lexi",50005.5,4)
        );
        String value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextLine();
            String finalValue = value;
            boolean productAvailable = products.stream().anyMatch(n
                    -> n.getTitle().equals(finalValue));
            if(productAvailable)
                break;
            System.out.println("Product not available!!!");
        }
        return value;
    }

    public static String readBrand( String prompt ) {
        List<Product> products = List.of(
                new Product("Pen","Lexi",10605.5,2),
                new Product("Pencil","Lexi",12005.5,1),
                new Product("Book","Lexi",20005.5,3),
                new Product("Phone","Lexi",50005.5,4)
        );
        String value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextLine();
            String finalValue = value;
            boolean productAvailable = products.stream().anyMatch(n
                    -> n.getBrand().equals(finalValue));
            if(productAvailable)
                break;
            System.out.println("Brand not available!!!");
        }
        return value;
    }
}