package Javapackage;

import java.util.Scanner;

public class P011 {

    public class Factor {
        public static void main(String[] args) {
            System.out.println(" ente the no ");
            int X;
            Scanner sc = new Scanner(System.in);
            X = sc.nextInt();
            for (int i = 1; i <= X; i++) {
                if (X % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}

