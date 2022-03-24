package ArrayBased;
public class Demo2 {
    Demo2(int x )
    {
        System.out.println(" helloooooooooono "+x);
    }
}
class Mix extends Demo2{
    Mix()
    {
        super(200);
        System.out.println(" hiiiiiiii " +92228);
    }
}
class Test extends Mix {
    Test(int x ,int y) {
        super();
        System.out.println("byyyyyy"+6454);
    }
      void Maxx()
    {
        System.out.println("string vlaue");
    }
    public static void main(String[] args) {
        {
         Test r=new Test(67,87);
         Test R=new Test(90,90);
         R.Maxx();
        }
    }
}
