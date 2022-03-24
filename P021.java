package Javapackage;

import java.util.Scanner;

public class P021 {
    public class Palimdrom {
        public static void main(String[] args) {
            System.out.println(" enter the no ");
            int n,r,c,s=0;
            Scanner sc=new Scanner(System.in);
            n= sc.nextInt();
            c=n;
            while (n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }
            if(c==s)
            {
                System.out.println(  " no is palimdrom");
            }
            else
                System.out.println(" no is no palimdrom");
        }
    }

}
