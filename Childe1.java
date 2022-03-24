package ArrayBased;
class Parent1{
    protected  void property()
    {
        System.out.println(" gold land");
    }
    protected void marry()        //overridinf
   // protected  static void marry()
    {
        System.out.println("father chice");
    }
}
//agar methedo k andr immplimarttion to ovver rrid krna ho ga
 class Childe1 extends  Parent1 {
    //protected void marry()
//      protected static void marry()
//      y
//      a
   // public static void marry()
    public  void marry()
    {
       // Parent1.marry();
        super.marry();
        System.out.println("childe choice");
    }
     public static void main(String[] args) {
         Childe1 c=new Childe1();
         c.property();
          c.marry();
        // marry();
     }
}
//class Childe2 extends ch
