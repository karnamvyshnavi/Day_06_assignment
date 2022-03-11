package com.bridgelabz;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int N=sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=N;i++) {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }



    }

}
