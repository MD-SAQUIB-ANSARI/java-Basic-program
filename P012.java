package Javapackage;

import java.util.Scanner;

public class P012 {
    public class Factorial
    {
        public static void main(String[] args) {
            Scanner SC=new Scanner(System.in);
            int n=1;
            n= SC.nextInt();
            long factpra=1;
            for (int i=1;i<=n;i++)
            {
                factpra=factpra*i;
            }
            System.out.println(factpra);
        }
    }

}
