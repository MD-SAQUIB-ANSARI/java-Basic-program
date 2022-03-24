package RevisionForChetu;

import java.util.Scanner;

public class P13 {
//    ARMESTRONG NO
public static void main(String[] args) {
    int a;
    int sum=0;
    int remd;
    int remder,num;
    System.out.println("enter the value of no is ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    num=a;
     while (num>0) {
         remd = num % 10;
         sum = sum + (remd * remd * remd);
         num = num / 10;
     }

         if (num == sum) {
             System.out.println("this is a armestromn no" + sum);
         } else {
             System.out.println("this is not armetroong no" + num);
     }
}
}