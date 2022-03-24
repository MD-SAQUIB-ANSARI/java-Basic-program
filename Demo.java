package RevisionForChetu;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        {
            int n,temp,revers=0;
            int remendr;
            System.out.println("eneter the no ");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            temp=n;
            while(temp!=0)
            {
                remendr=temp%10;
                revers=revers*10+remendr;
                temp=temp/10;
            }
            if (n==revers)
            System.out.println(revers +"this no is palimdrom");
            else System.out.println(revers+  " is not revers no");
        }
    }
}
