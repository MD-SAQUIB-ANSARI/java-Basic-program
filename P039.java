package Javapackage;
import java.util.Scanner;
public class P039 {
    public class UsingWhil {
        public static void main(String[] args) {
            Scanner SC=new Scanner(System.in);
            int n=1,i=1;
            int facoria =1;
            n =SC.nextInt();
            while (i<=n)
            {
                facoria=facoria*i;
                i++;
            }
            System.out.println(facoria);
        }
    }

}
