package Javapackage;

import java.util.Scanner;

public class P10 {
    public class ChareteChecked {
        public static void main(String[] args) {
            System.out.println(" netr the val;ue of strings");
            String str;
            int Vcount=0;
            int CCount=0;
            Scanner sc=new Scanner(System.in);
            str = sc.next();
            str=str.toLowerCase();
            for (int i=0; i<=str.length();i++)
            {
                if (str.charAt(i) == 'a' && str.charAt(i) == 'o' && str.charAt(i) == 'i'
                        && str.charAt(i) == 'e' && str.charAt(i) == 'U');
                {
                    Vcount++;
                }

            }
            System.out.println(Vcount);
        }
    }

}
