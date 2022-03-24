package Javapackage;

import java.util.Random;
import java.util.Scanner;
public class P025 {
    public class Rendom {
        public static void main(String[] args) {
            System.out.println(" entr rendom no");
            int a;
            Scanner sc=new Scanner(System.in);
            Random t=new Random();
            for ( a=1;a<=100;a++)
            {
                System.out.println(t.nextInt(100));
            }
        }
    }

}
