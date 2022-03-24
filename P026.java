package Javapackage;

import java.util.Scanner;

public class P026 {
    public class RversNo {
        public static void main(String[] args) {
            System.out.println(" enter the boo");
            int a, revrs=0 ,r;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            while (a>0)
            {
                r=a%10;
                revrs=revrs*10+r;
                a=a/10;
            }
            System.out.println(revrs);
        }
    }

}
