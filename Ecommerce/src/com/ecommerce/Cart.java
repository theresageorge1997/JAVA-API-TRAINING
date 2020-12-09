package com.ecommerce;

import java.util.ArrayList;
import java.util.List;


public class Cart{

    private List<Product> items=new ArrayList();


    public void addToCart(Product p){
        items.add(p);
        System.out.println(p.getTitle() +" added to Cart");
    }



    public void removeFromCart(Product p){
        items.remove(p);
    }

    public void emptyCart(){
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }
}