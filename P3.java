package RevisionForChetu;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.println("enter the no vlue of a");
        int a=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        int i=2;
        while (i<a)
        {
            sum=sum+a;
            i++;
        }
        System.out.println("the total no of elements is 0"+sum);
    }
}
