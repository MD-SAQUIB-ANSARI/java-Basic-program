package StringBased01;

import java.util.Scanner;

public class String006 {
    public static void main(String[] args) {
        String str;
        int count=0;
        System.out.println("enter the string value");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for (int i=0; i<str.length();i++) {
            if(str.charAt(i)==';'||str.charAt(i)=='/'||str.charAt(i)=='"'||str.charAt(i)=='?'||str.charAt(i)==':')
            {
                count++;
            }
        }
        System.out.println(" the value of puncacution is "+  count);
    }
}
