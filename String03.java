package StringBased01;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        System.out.println("enter the value of strinhg");
        String str1;
        Scanner sc=new Scanner(System.in);
        str1= sc.next();
        System.out.println(str1);
        for (int i=0;i<=str1.length();i++)
        {
            System.out.println(str1.length());
            System.out.println(str1.toLowerCase());
            System.out.println(str1.toUpperCase());
            System.out.println(str1.charAt(i));
            System.out.println(str1.isBlank());
            System.out.println(str1.isEmpty());
            System.out.println(str1.repeat(i));;

        }
    }
}
