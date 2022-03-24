package ArrayBased;
import java.util.*;
public class IntToString {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String s = Integer.toString(n);
            System.out.println(s);
            if(n==Integer.parseInt(s)){
                System.out.println("this is string prohram");
            }
            else {
                System.out.println(" anather string");
            }

        }
}
