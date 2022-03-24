package RevisionForChetu;

import java.util.Scanner;

public class SpecialChar {
    public static void main(String[] args) {
        int i=32;
        System.out.println("enterthe va;lue pf specila and LITTER");
        while (i<=127) {
            char a;
            Scanner sc = new Scanner(System.in);
            a = sc.next().charAt(0);
            int spceial = a;
            i++;
            System.out.println(" "+ spceial );
        }
    }
}
