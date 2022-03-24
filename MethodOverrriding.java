package RevisionForChetu;

public class MethodOverrriding {
   protected void lone()
    {
        System.out.println("good for me");
    }
   protected void marry(int x)
    {
        System.out.println("fathr choice");
    }
}
class M extends MethodOverrriding{
    public void marry()
    {
//        super.marry(45);
//        System.out.println("chile choice");
    }
    public static void main(String[] args) {
        M r=new M();
                r.marry(234);
                r.lone();
    }
}
