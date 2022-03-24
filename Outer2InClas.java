package RevisionForChetu;
public class Outer2InClas {
    private int num=11202;
    class Inner{
    void show ()
    {
        System.out.println("num  ="  +num);
    }
    }
}
class Test {
    public static void main(String[] args) {
//        new Outer2InClas().new Inner();
        Outer2InClas o=new Outer2InClas();
        Outer2InClas .Inner i= o.new Inner();
        i.show();
    }
}