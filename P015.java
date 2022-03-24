package Javapackage;

import java.util.Scanner;

public class P015 {
//package com.company;
//
//import javax.security.sasl.SaslClient;
//import java.util.Scanner;
//
//public class CharacterInput {
//    public static void main(String[] args) {
//        System.out.println(" entr the cahrecter value");
//        char ch;
//        int count=0;
//        int count1=0;
//        Scanner sc=new Scanner(System.in);
//            ch= sc.next().charAt(0);
//            if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u')
//        {
//            System.out.println(ch+ " this is a vhowels");
//            System.out.println(count);
//            count++;
//        }
//            else {
//
//                System.out.println( ch+" this is a noy a vohels");
//                System.out.println(count1);
//                count1++;
//            }
//
//
//    }
//}
    public class IncreasingNo {
        public static void main(String[] args) {
            int a,b,c;
            int n=0;
            System.out.println("enter your no ");
            Scanner sc=new Scanner(System.in);
            a= sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            for (int i=n;n<3;i--) {
                if(i==a||i==b||i==c)

                {
                    System.out.println("the no is increassing order" + i);
                    n++;
                }
            }
        }
    }


}
