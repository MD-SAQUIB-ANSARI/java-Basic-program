package Javapackage;
public class Student {
    private int studenid;
    private String studentName;
    private static String facultyName= "rajeev sr";

    Student(int studenid, String studentName, String facultyName) {
        this.studenid = studenid;
        this.studentName = studentName;

    }

    public String toString() {
        return studenid + studentName + facultyName;
    }
}
    class Student1 {
        private int studentid;
        private String StudentName;

        public static void main(String[] args) {
            Student str = new Student(  1212, "      SAQUIB ANSARI", "");
            Student str1 = new Student(  1212, "     Kritika", "");
            Student str2 = new Student(  1212, "     Sazzad", "");
            System.out.println(str + "\n" + str2 + "\n" + str1 + "\n");
        }
    }


