package StringBased01;
import java.util.Scanner;
public class A11 {
    public static void main(String[] args) {
        System.out.println("ente the value of araray");
        int a[]=new int[5]; int temp;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }
        for (int i=0;i<5;i++) {
            System.out.print(+a[i]);
        }
        for (int i=0;i<=5; i++)
        {
            for (int j=i+1; j<i;j++)
            {
//                if(a[i]>a[j])
//                {
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//
//                }
                if (a[i]%2==0)
                {
                    System.out.println("the even no is { " +a[i]+ " } ");
                }
                else
                {
                    System.out.println("the   ood no is { " +a[i]+ "}");
                }
            }

        }
        for (int i=0;i<5;i++) {
            System.out.print(  "    "   +          a[i]   +   "ghfg ");
        }
//        }
    }
}

