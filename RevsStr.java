package P1;

import java.util.Arrays;

public class RevsStr {
    public static void main(String[] args) {
        String  str="java";
        char arr[]=str.toCharArray();
        for (int i=0;i<arr.length;i++)
        {
           for (int j=0;j<arr.length;j++)
           {
               if (arr[i]==arr[j])
               {
                   System.out.print(arr[i]);
               }
           }
        }
    }
}
