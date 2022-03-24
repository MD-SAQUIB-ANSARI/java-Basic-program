package StringBased01;

import java.util.Scanner;

public class String005 {
    public static void main(String[] args) {
        System.out.println(" enter the value os string");
        String str;
//         FOR CAPITAL LATTER
          String str2;
        int countV2=0;
        int COUNTC2=0;
        int counV=0; int COUNTc=0;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        str=str.toUpperCase();
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='a'&& str.charAt(i)=='A'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
            {
                counV++;
            }
            else

                COUNTc++;
        }
        System.out.println(" the coun veowel is "   +   counV);
        System.out.println("the value is COUNT consenent CC    "  +COUNTc);
        for (int i1=0;i1<str.length();i1++)
        {
        if (str.charAt(i1)=='A'|| str.charAt(i1)=='E'|| str.charAt(i1)=='I'|| str.charAt(i1)=='O'|| str.charAt(i1)=='U')
        {

         countV2++;
        }
        else

            COUNTc++;
    }
        System.out.println("the value is COUNT consenent     "  +countV2);
        System.out.println(" the coun veowel is "   +   COUNTC2);
    }
}
