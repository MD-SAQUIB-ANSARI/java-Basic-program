package com.company;

public class CopyCunstructer {
    class A{
        int a; String b;
         A()
         {
             int a=90; b=" xxxxxxxxxx";
             System.out.println(" the value of a md b brfor copy"  +a +"" +b);
         }
         A(A ref)
         {
            a=ref.a;
            b=ref.b;
         }
    }
    class B
    {
        public static void main(String[] args) {
//            A r=new A();
//            ref1 A()
        }
    }
}
