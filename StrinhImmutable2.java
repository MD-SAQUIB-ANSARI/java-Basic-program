package StringBased01;
public class StrinhImmutable2 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=str1.concat("java2blog");
        System.out.println(str1);
//        str1=str1.concat(str1);
//        System.out.println(str1.concat(str2));
        System.out.println(" the strin is     "   +str2);
    }

}
