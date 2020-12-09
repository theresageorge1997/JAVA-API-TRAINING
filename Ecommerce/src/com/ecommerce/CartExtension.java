package com.ecommerce;

public class CartExtension extends Cart{

    public void checkout(){
        //handlePayment();
        //confirmOrder();
        //printPaymentSummary();
        //emptyCart();//after confirmation of order empty the cart
    }

    public void printCart(){
        System.out.println("==================================");
        System.out.println("CART ITEMS:");
        System.out.println("==================================");
        for (Product p : getItems()) {
            System.out.println("PRODUCT Title: "+p.getTitle());
            System.out.println("PRODUCT Brand: "+p.getBrand());
            System.out.println("PRODUCT PRICE: "+p.getPrice());
            System.out.println("PRODUCT Rating: "+p.getRatings());
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println(" Total Items : "+getItems().stream().count());
        System.out.println("==================================");
    }

}