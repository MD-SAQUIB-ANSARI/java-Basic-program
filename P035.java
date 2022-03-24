package Javapackage;

public class P035 {
    public class StringReaptLetter {
        public static void main(String[] args) {
            System.out.println(" ent5er the strinhg value ");
            String s="tgis is a chetub product of md saquib ansari SAQUIB ANSARI";
            int count=s.length();
            int AfterRemovel= s.replace("a","").length();
            int totalCount=count-AfterRemovel;
            System.out.println(totalCount +" this a repet late ");
            System.out.println(AfterRemovel+  " how many element is present in string");
        }
    }

}
