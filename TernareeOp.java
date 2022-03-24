package ArrayBased;

import java.util.Scanner;

public class TernareeOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        int maix;
        maix=(n>m)?(n>o?n:o):(m>o)?m:o;
        System.out.println(maix);
    }
}
