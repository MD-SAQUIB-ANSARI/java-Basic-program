package StringBased01;

import java.util.Scanner;

public class ArnwsrtinoNo {
    public static void main(String[] args) {
        int n=153, temp, rmndr, sum = 0;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
        temp=n;
        while( temp!=0)
        {
             rmndr=temp%10;
             sum=sum+(rmndr*rmndr*rmndr);
             temp=temp/10;
        }
        if (sum==n)
            System.out.println(sum+"this is a armenstromg no");
        else
            System.out.println("thisbdfdhsbfjfds nooo");
    }
    }

