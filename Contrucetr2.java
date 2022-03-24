package com.company;
public class Contrucetr2 {
//    private Integer x=0;
//    private Integer x;
    public Integer x=0;
    private  String y;
    public boolean c;
    public Contrucetr2( Integer NO,String name)
    {
     x=NO;
     y=name;
        x=8787;
        y="hhhhhhhhh";
     this.x=x;
     this.y=y;
//     or
//        System.out.println( x+ ,+y,+name);
    }

    public void Show()
    {
        System.out.println(" this ctefdhg  "  +x  + "  "  +y  +"  " +c);
        System.out.println(this.x);
        System.out.println(this.y);

    }
    public static void main(String[] args) {
        System.out.println(" creat the object");
//        Contrucetr2 REF=new Contrucetr2(110,  "  saquib ansari  ");

//        copy cunster ha niche walea exm/pler
        Contrucetr2 ref=new Contrucetr2(90,"HGHG" );
//        REF.Show();
        ref.Show();

    }
}

