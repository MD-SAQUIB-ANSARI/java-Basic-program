package StringBased01;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int number=0;
        int total =0;
        Scanner sc=new Scanner(System.in);
        while (true) {
            do {
                System.out.println(" enter the value of ");
               number = sc.nextInt();
               total = total + number;
//                ----------------------

//                total=total+ sc.nextInt();
            } while (number != 0);
            System.out.println(" the sumo of no is " + total);
        }
    }
}
