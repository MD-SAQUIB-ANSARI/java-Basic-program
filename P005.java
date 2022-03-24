package Javapackage;

public class P005 {

        public static void main(String[] args) {
            System.out.println(" ente rhe value of arr");
            float arr[] = {766.56f, 4.67f, 676.43f, 5655.56f};
            float AVG=0; float sum =0;
//        double arr1[] = {74.55, 78685.6453654};
            for (int i = 0; i < arr.length; i++) {
                System.out.print("  " + arr[i]);
                sum=sum+arr[i];
            }
            System.out.println(  "  this is a syum"  +sum);
            AVG=sum/ arr.length;
            System.out.println( "  this is a value of avtfgt    " +AVG);
        }
    }

