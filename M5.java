package StringBased01;
import java.util.Arrays;
public class M5 {
    public static void main(String[] args) {
        String str = "saquib";
        int count=0;
        char arr[] = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        String str2="java is a populer programing language in the worrld ";
        System.out.println(str2.charAt(5));
        System.out.println(str2.length());
        str2=str2.toLowerCase();
        System.out.println(str2);
        System.out.println(str2.toUpperCase());
        System.out.println(str2.repeat(1));
        count++;
        System.out.println(count);
    }
}
