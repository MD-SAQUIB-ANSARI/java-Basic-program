package StringBased01;
class Student {
    int roll,marks;
    String name;
     void input()
     {
         System.out.println(" Enter youe rol no nand name ,marks");
     }
}
class Amit extends  Student{
    void show()
    {
        roll=90;marks=890;
        name="Ankit kumer ";
        System.out.println("Details of NKIT KUMAR is   " + "roll no is "  +roll +  "   "  + "marks = " +marks   + " the name is=  " +name);
    }
}
public class Inherit {
    public static void main(String[] args) {
        Amit dt=new Amit();
        dt.input();
        dt.show();
    }
}
