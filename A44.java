package StringBased01;

public class A44 {
    public static void main(String[] args) {
        System.out.println(" revetrs the string is ");
        String str = " saquibcool";
        int len = str.length();
        int revers = 0;
      String revers1 = null;
        for (int i = len - 1; i >= 0; i--) {
            revers = revers + str.charAt(i);
            revers1 = revers1 + str.charAt(i);
        }
        System.out.println(" the revers string in is count is  " + revers);
        System.out.println(revers1 + "    this is a value of striing revers   ");
    }
}
