package StringBased01;
import java.util.Scanner;

//public class A33 {
//    public static void main(String[] args) {
//        int n;
//        int sum=0;
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("Input an integer");
//            n = input.nextInt();
//                        if (n != 0) {
//                System.out.println("You entered " + n);
//                sum=sum+n;
//                            System.out.println(" the value of sum si is  "  +sum);
//                            System.out.println("do oyu wnat to continue");
//                                continue;
//                            }
//                        else {
//                         break;
//            }
//        }
//    }
//}
public class A33 {
    public static void main(String[] args) {
        int n;
        int sum=0;
        String str;
        Scanner input = new Scanner(System.in);
    do {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n != 0) {
                System.out.println("You entered " + n);
                sum=sum+n;
                System.out.println(" the value of sum si is  "  +sum);
                System.out.println("do oyu wnat to continue");
                continue;
            }
            else {
                break;
            }
        }while (n!=0);
    }
}