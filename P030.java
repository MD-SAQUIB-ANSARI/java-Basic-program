package Javapackage;

import java.util.Scanner;

public class P030 {
    public class StringImmutable {
        public static void main(String[] args) {
            System.out.println("enter the value od arra ekements");
            int arr[]=new int[5];
            Scanner sc=new Scanner(System.in);
            for (int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(" enter the elmnst");
            for (int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+ " ");
            }
            System.out.println(" enter the revers elmnst");
            for (int i= arr.length-1; i>=0;i--)
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }

}
