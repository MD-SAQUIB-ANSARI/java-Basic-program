package ArrayBased;
class parent{
    //int x=100;
    static  int x=2000;
}
 class Childe2 {
    //int x=100;
    static int x=1000;
    void  show()   // ststic final protecte ,
    {
        System.out.println("this is a " +parent.x  +"and "  +x);
        System.out.println("this is a " +parent.x  +"and "  +x);
    }
     public static void main(String[] args) {
        Childe2 r=new Childe2();
        r.show();
     }
}
