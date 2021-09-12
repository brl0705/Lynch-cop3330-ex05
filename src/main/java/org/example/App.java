package org.example;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        int num1;
        int num2;
        int ans;

        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the first number? ");
        num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the second number? ");
        num2 = input2.nextInt();

        ans=num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + ans);

        ans=num1-num2;
        System.out.println(num1 + " - " + num2 + " = " + ans);

        ans=num1*num2;
        System.out.println(num1 + " * " + num2 + " = " + ans);

        ans=num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + ans);

    }
}
