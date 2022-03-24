package StringBased01;
 class A
 {
     int a,b,c;
     void  add()
     {
         a=90;b=20;
         c=a+b;
         System.out.println("the value of sum is " +c);

     }
     void  sub() {
         a=234;b=43;
         c = a - b;
         System.out.println("the value of sub  "  +c);
     }
 }
 class B extends A{
        void DIVISION()
      {
         a =200;
         b=25;
         c=a/b;
         System.out.println("the value os division is " +c);
     }
 }
 class c extends B{
     void remd()
     {
         a=7679;
         b=880;
         c=a%b;
         System.out.println("the value of remender is  " +c);
     }
 }
public class MultiLevel {
    public static void main(String[] args) {
        c r=new c();
        r.add();r.sub();r.DIVISION();r.remd();
        System.out.println();
    }
}
