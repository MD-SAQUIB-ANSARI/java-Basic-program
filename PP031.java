package Javapackage;

import java.util.Scanner;

public class PP031 {
    public class SwitcCase {


        public static void main(String[] args) {

            /*
             * Switch statement starts here. Added three cases and
             * one default statement. The default statement will
             * keep on executing until i&lt;5. In this case, it will
             * execute 2 times for i=3 and i=4.
             */
            int x;
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            switch(x){
                case 0:
                    System.out.println("i value is 0");
                    break;

                case 1:
                    System.out.println("i value is 1");
                    break;

                case 2:
                    System.out.println("i value is 2");

                    break;
                case 3:
                    System.out.println(" hgherehgerjhgjg");
                default:
                    System.out.println("i value is greater than 2 and less than 5");
            }
        }
    }


}
