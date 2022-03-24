package RevisionForChetu;

import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        int a=0,b=0;
        int gcd=1;
        System.out.println("enter the value od a bad b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i=1;i<=a && i<=b;i++)
        {
         if (a%i==0 && b%i==0)
                gcd=i;
        }
        System.out.println("gcd is "+gcd);
    }
}
