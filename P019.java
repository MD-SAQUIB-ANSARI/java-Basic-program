package Javapackage;

import java.util.Scanner;

public class P019 {
    public class NoIsNaegOrPos {
        public static void main(String[] args) {
            System.out.println("entr ther no ");
            Scanner sc=new Scanner(System.in);
//        Scanner SC=new Scanner(System.in);
            int a= sc.nextInt();
            if (a>0)
            {
                System.out.println(a+ "is positeve");
            }
            else {
                System.out.println(a+  "is nagetive");
            }
        }
    }


}
