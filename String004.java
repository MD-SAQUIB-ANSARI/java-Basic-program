package StringBased01;

import java.util.Scanner;

public class String004 {
    public static void main(String[] args) {
        char[] ch;
        String str;
        int num=0,litte=0,space=0,special=0;
        System.out.println("enter the value of srring");
        Scanner sc=new Scanner(System.in);
        str= sc.nextLine();
        int lengh=str.length();
         ch =str.toCharArray();
        for (int i=0;i<lengh;i++)

        {
            if(Character.isLetter(ch[i]))
            {
                litte++;
            }
            else if (Character.isDigit(ch[i]))
                num++;
            else if (Character.isSpaceChar(ch[i]))
                space++;

            else
                special++;
        }
        System.out.println("litter no is  "  +litte);
        System.out.println("the no digit"+num);
        System.out.println("space only"+space);
        System.out.println("special chatractre"   +special);
    }
}
