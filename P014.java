package Javapackage;

public class P014 {
    public class Gcd {
        public static void main(String[] args) {
            System.out.println("enenjfgmfdbhg");
//        Scanner SC=new Scanner(System.in);
//        int a= SC.nextInt();
//        int b= SC.nextInt();
            int a=81;
            int b=153;
            int gcd=1;
            for (int i=1;i<=a;i++)
            {
                if (a%i==0 && b%i==0)
                    gcd=i;
            }
            System.out.println(gcd+  " gcd is ");

        }
    }

}
