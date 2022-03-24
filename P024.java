package Javapackage;

public class P024 {
//public class RemoveSting {

//    public static void main(String[] args) {
//
//        String description = "mesquite in your cellar";
//        String replace = description.replace('e', 'o');
//        System.out.println(replace);
//    }

//}

    public class RemoveSubStringFromStringMain {
        public static void main(String[] arg) {
            String age = "Peter is 29 years old, and Jane is 60 years old";
            String replaceFirst = age.replaceFirst("\\d\\d", "30");
            System.out.println(replaceFirst);

//        public class RemoveSubStringFromStringMain {
//            public static void main(String[] arg) {
            String fruit = "Mary likes apples saquib ansari ";
            String replace = fruit.replace("apples", "");
            String replace1 = fruit.replace("a", "");
            System.out.println(replace);
            System.out.println(replace1);
        }
    }



}
