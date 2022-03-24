package Javapackage;

import java.util.Scanner;

public class P013 {
    public class Fibbb {
        public static void main(String[] args) {
            int tern, count, a = 0, b = 1;
            Scanner SC = new Scanner(System.in);
            tern = SC.nextInt();
            for (int i=0;i<=tern;i++)
            {
                System.out.print( a + "  " );
                count=a+b;
                a=b;
                b=count;
            }
        }
    }
}
