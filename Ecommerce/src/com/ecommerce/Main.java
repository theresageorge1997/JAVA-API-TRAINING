package com.ecommerce;

public class Main {
    public static void main(String[] args) {

        String productTitle = Console.readTitle("Enter the product: ");
        String productBrand = Console.readBrand("Enter the brand: ");
        double price = Console.readNumber("Enter the price: ", 1000, 100000);
        int ratings = Console.readNumber("Enter the rating: ",1,5);

        CartExtension cart=new CartExtension();

        //Add First product to Cart
        Product p1=new Product();
        p1.setTitle(productTitle);
        p1.setBrand(productBrand);
        p1.setPrice(price);
        p1.setRatings(ratings);
        cart.addToCart(p1);



        cart.printCart();

    }
}