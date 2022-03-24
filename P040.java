package Javapackage;

import java.util.Scanner;

public class P040 {

    public class Vowel {
        public static void main(String[] args) {
            System.out.println(" entrh the value of string");
            char ch;
            Scanner SC =new Scanner(System.in);
            ch = SC.next().charAt(0);
            if (ch=='a'|| ch== 'i'|| ch=='e'|| ch=='o'|| ch=='u')
            {
                System.out.println(ch +" is vowel");
            }
            else
            {
                System.out.println(" is not vowel");
            }
        }
    }
































































}
