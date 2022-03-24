package RevisionForChetu;
import java.util.Scanner;
public class P8 {
    public static void main(String[] args) {
        int base;
        int power;
        int result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the value of cbase");
        base=sc.nextInt();
        System.out.println("enter the value of power");
        power =sc.nextInt();
        for (int i=1;i<power;i++)
        {
            result=result*base;
        }
        System.out.println(result);
    }
}
