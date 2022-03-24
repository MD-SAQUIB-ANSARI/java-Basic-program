package com.company;

public class ParametrizCotercter {
        int x;
        String y;
        ParametrizCotercter(int a,String STR)
        {
            int x=a;
            String y=STR;
        }
        void show()
        {
            System.out.println( x +  " "  +y);
        }
    }
    class Demo2
    {
        public static void main(String[] args)
        {
            ParametrizCotercter ref=new ParametrizCotercter(67788,"SHGSNBFV");
            ref.show();
        }
    }


