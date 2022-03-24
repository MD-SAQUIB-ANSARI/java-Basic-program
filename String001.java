package StringBased01;

import java.util.Scanner;

public class String001 {
    public static void main(String[] args) {
////        1
//        System.out.println("entert the valu of asic ");
//         for (char  a1='a'; a1<='z'; a1++)
//         {
//             System.out.print("   "    +a1);
//         }
//        System.out.println("");
////         2
//
//         for (char a1='A';a1<='Z';a1++)
//         {
//             System.out.print("   "   +a1);
//         }
//        System.out.println("");
//         3
        System.out.println(" enter the value of charecter");
         char a3;
        Scanner sc=new Scanner(System.in);
        a3=sc.next().charAt(0);
        int b=(char)a3;
        System.out.println(a3);
        System.out.println(b);
//        4
        System.out.println("");
        for (int i=65;i<=90;i++)
        {
            char a=(char)i;
            System.out.print("   "    +a);
        }

   }
}
