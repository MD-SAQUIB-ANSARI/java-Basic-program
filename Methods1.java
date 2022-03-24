package StringAllMethods;

public class Methods1 {
    public static void main(String[] args) {
        String str="saquiib ansari this is a good software developer";
         StringBuffer sb=new StringBuffer("saquiib ansari this is a good software developer");
         sb.append("aaaaaa");
         sb.append('s');
         sb.append(23);
         sb.append(3422.34);
         sb.append(625445.5457);
         sb.append("ROSEEEEEEE");
         sb.capacity();
         sb.charAt(22);
         sb.append(true);
        System.out.println(sb);
         String str1=str.substring(5);
         String str2=str.replaceAll("saquiib","aaaaaaaaaaa");
        System.out.println(str2);


    }
}
