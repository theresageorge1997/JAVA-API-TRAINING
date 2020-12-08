package com.company;

public class Operators {
    public static void main(String args[]) {
        int x=100+10;
        int sum2 =100;
        int sum3=sum2+50;
        short x1=1;
        int y=x1+2;
        System.out.println(y);
        //Implicit casting or Widening casting(automatically)
        //converting small types to larger type size
        //byte > short > int > float > double
        double x2=1.1;
        double y2 = x2+2;
        System.out.println(y2);

        //Explicit casting or Narrowing casting(manually)
        //converting larger type to small type size
        double x3 = 1.1;
        int y3= (int)x3+2;
        System.out.println(y3);

        //parse
        String x4="5";
        int y4 =Integer.parseInt(x4)+2;
        System.out.println(y4);

        String x5="5.1";
        double y5 =Double.parseDouble(x5)+2;
        System.out.println(y5);

        //precedence(operators priority
        int x6= 10 +2*3;
        System.out.println(x6);

        int y6= (10 +2)*3;
        System.out.println(y6);

    }
}
