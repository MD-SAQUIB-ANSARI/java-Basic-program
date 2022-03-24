package Javapackage;

import java.util.Scanner;

public class P004 {

    public class ArmstronnNo {
        public static void main(String[] args) {
            System.out.println(" enter the no");
            Scanner SC=new Scanner(System.in);
            int n,remender,orignal,sum=0;
            n= SC.nextInt();
            orignal=n;
            while (orignal != 0)
            {
                remender=n%10;
                sum +=Math.pow(remender,3);
                orignal /=10;
            }
            if (sum==orignal)
            {
                System.out.println(orignal);
            }
            else
            {
                System.out.println(n + " is not amtgstro no");
            }

        }
    }

}
