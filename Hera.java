package StringBased01;
class  X
{
    void show()
    {
        System.out.println("enter  your name ");
    }
}
class Y extends X{
    void input()
    {
        System.out.println("my name is MoHAMMAD SAQUIB ANSARI from bgp");
    }
}
class Z extends  X {
    void output() {
        System.out.println(" My  sir name is ANSARI ");
    }
}
public class Hera {
    public static void main(String[] args) {
       Y R=new Y();
       Z R1=new Z();
       R.show();R.input();
        R.show(); R1.output();
    }
}
