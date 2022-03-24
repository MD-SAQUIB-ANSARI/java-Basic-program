package RevisionForChetu;

import java.util.Scanner;

public class ReversNo {
    public static void main(String[] args) {
        int a, revers = 0, remehder;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (; a != 0; ) {
            remehder = a % 10;
            revers = revers * 10 + remehder;
            a = a / 10;
        }
         System.out.println(revers);
    }
}
