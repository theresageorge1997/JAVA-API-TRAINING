package com.polymorphism;

class Calculator
{
    int add(int a, int b)
    {
        return a+b;
    }
    int  add(int a, int b, int c)
    {
        return a+b+c;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        System.out.println("Results:");
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}
