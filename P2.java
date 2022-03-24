package RevisionForChetu;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        int sum=0;
        int a;
        System.out.println("enter the vlaue of a is ");
        Scanner sc=new Scanner(System.in);
        do {
            a=sc.nextInt();
            System.out.println(" coninue no enetr");
            sum=sum+a;
            System.out.println(sum);
        }while (a>0);
        System.out.println("the total no adding is "+sum);
    }
}
