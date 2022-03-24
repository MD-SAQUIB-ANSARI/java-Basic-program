package StringBased01;

import java.util.Scanner;

public class AddNomber {
    public static void main(String[] args) {
        int n=1;

        Scanner sc=new Scanner(System.in);
        int sum=0;
//             for (int i=0;n!=0;i++)
             for (int i=0;;i++)
            {
                System.out.println("enter the  no");
                n = sc.nextInt();
                //                if (n == 0)
                //         break;
                  sum = sum + n;
            }

//             System.out.println(sum);
        }
    }

