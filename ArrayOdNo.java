package StringBased01;

import java.util.Scanner;

public class ArrayOdNo {
//    public static void main(String[] args) {
//        System.out.println("ente the value of araray");
//        int a[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            if (a[i]%2==0) {
//                System.out.println("the no is even "+a[i]);
//            }
//            else
//            {
//                System.out.println("the no is ood"+a[i]);
//            }
//        }
//    }

        public static void main(String[] args)
        {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("how many no nis requred for checkred");
            n = sc.nextInt();

            int[]arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int count_odd =0, count_even = 0;
            for(int i = 0; i < n; i++)
            {
                if(arr[i] % 2 == 0) {
                    count_even++;
                    System.out.println(arr[i]);
                    System.out.println("tis is a even no "+count_even);
                }
                else
                    System.out.println("tHE ood NO IS "+arr[i]);
                    count_odd++;
                System.out.println("this is a no is even "+count_odd);

            }
//            System.out.println("this is a even no is" + arr[i]+ count_odd);
//            System.out.println("this is a ood no" + count_even);

        }
    }

