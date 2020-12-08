package com.polymorphism;

public class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Bow Bow");
    }
    public static void main(String args[]){
        Animal obj = new Dog();
        obj.sound();
    }
}