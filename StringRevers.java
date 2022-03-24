package StringBased01;
public class StringRevers {
     static String show(String str)
    {
        String REV="";
        int lang=str.length();
        for (int i=lang-1;i>=0;i--)
       {
          REV=REV+ str.charAt(i);
       }
        return REV;
    }
    public static void main(String[] args) {
        String str="saquibaHJHNbsari";
        String RS=show(str);
        System.out.println(RS);
     }
//    public static void main(String[] args) {
//        String str="saquibabsari";
//        String REV="";
//        int lang=str.length();
//        for (int i=lang-1;i>=0;i--)
//        {
//            REV=REV+ str.charAt(i);
//        }
//        System.out.println(REV);
//    }
}
