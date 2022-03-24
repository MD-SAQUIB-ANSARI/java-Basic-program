package RevisionForChetu;
import java.util.Scanner;
public class Lcm {
//    public static void main(String[] args) {
//        int n, n1;
//        int gcd=1;
//        int lcm=0;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        n1=sc.nextInt();
//        for (int i=1;i<=n && i<=n1;i++)
//        {
//        if(n%i==0 && n1%i==0)
//            gcd=i;
//        }
//        System.out.println(gcd);
//        lcm=(n*n1)/gcd;
//        System.out.println(lcm);
//        }
    public  static int show(int x,int y)
    {
        int gcd=1;
        int lcm=(x*y)/gcd;
        for (int i=1;i<=x && i<=y;i++) {
            if (x % i == 0 && y % i == 0)
                gcd=i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        int n,n2,lcm;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n2=sc.nextInt();
      int gcd = show(n,n2);
        System.out.println(gcd);
        lcm=show(n,n2);
    }
    }

