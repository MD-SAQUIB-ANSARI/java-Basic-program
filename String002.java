package StringBased01;

public class String002 {
    public static void main(String[] args) {
        System.out.println(" enter the value of string");
        String st1=" this is a Noid sectore hii jhfd";
        int count=0;
//        count all charecter except spece
        for (int i=0;i <=st1.length();i++)
        {
            if(st1.charAt(i)!= ' ');
                count++;
        }
        System.out.println(count);
    }
}
