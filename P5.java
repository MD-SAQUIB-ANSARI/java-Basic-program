package RevisionForChetu;
import javax.swing.plaf.SeparatorUI;
import java.util.Arrays;
public class P5 {
    public static void main(String[] args) {
        String str="saquib ansari";
        char arr[]=str.toCharArray();
        System.out.println(arr.length);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass());
        System.out.println(arr.hashCode());
        System.out.println(arr.equals(str));
        System.out.println(str.indexOf(0));
        String str2="THIS IS A JAVAVGDVFHV AND AYI";
        System.out.println(str2.repeat(2));//stirng ko pure reapt kerga
        String str3=str2.toLowerCase();
        System.out.println(str3);
    }
}
