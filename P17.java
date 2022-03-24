package RevisionForChetu;

public class P17 {
    public static void main(String[] args) {
        String str="hdgGJGJHjgd9867hsgfgHGHSFABF868476385Fjhjgbefhjh7655^%%&^*GF";
        String  str2=str.replaceAll("[^a-zA-Z0-9]","");
        String  str3=str.replaceAll("[^a-zA-z]","");
        String  str4=str.replaceAll("[^a-z]","");

        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
