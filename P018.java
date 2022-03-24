package Javapackage;

import java.util.Scanner;

public class P018 {
    public class LeapYear {
        public static void main(String[] args) {
            System.out.println(" enter the saal avl;uer");
            int n=0;
            Scanner SC=new Scanner(System.in);
            n= SC.nextInt();
            if((n%400==0)||(n%4==0)&&(n%100!=0))
            {
                System.out.println( n+ " si leap yera");
            }
            else
            {
                System.out.println(" not leap yrae");
            }
        }
    }

}
