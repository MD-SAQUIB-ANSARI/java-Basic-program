package com.company;
    class A {
        Integer a;
        String B;
//         consuterter
         A() {
            a = 90;
           B = "XXXXXXX";
      }
//      methods
       void Sow()
       {
            System.out.println(a + " " + B);
        }
    }
    class NonParametrizC
    {
        public static void main(String[] args) {
            A re=new A();
            re.Sow();
        }
    }