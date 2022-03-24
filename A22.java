package StringBased01;

import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        System.out.println(" enter the no");
        Scanner SC=new Scanner(System.in);
        int n,remender,orignal,sum=0;
        n= SC.nextInt();
        orignal=n;
        while (orignal != 0) {
            remender = n % 10;
            sum += Math.pow(remender, 3);
            orignal /= 10;
            System.out.println(sum);
        }
            if (sum == orignal)
            {
                System.out.println(orignal);
            } else {
                System.out.println(n + " is not amtgstro no");
            }

    }
}
