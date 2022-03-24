package Javapackage;

import java.util.Scanner;

public class P017 {
    public class LargestNo {
        public static void main(String[] args) {
            System.out.println("enter the no ");
            Scanner SC=new Scanner(System.in);
            int a[]=new int[5];
            for (int i=0;i<a.length;i++)
            {
                a[i]=SC.nextInt();
            }
            for (int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+  " ");
            }



        }
    }

}
