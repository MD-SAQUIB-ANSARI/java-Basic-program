package RevisionForChetu;
import java.io.FileOutputStream;
import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        System.out.println("enter the no is which is  add ");
            int a;
        int SUM=0;
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=6;i++)
        {
            a=sc.nextInt();
            System.out.println("enyter the no again");
            SUM=SUM+a;
            if (a>=i)
            {
                continue;
            }
        }
        System.out.println( "fgvhhff" +SUM);
        sc.close();
    }
}
