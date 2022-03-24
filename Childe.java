package ArrayBased;

   class Parent {
       protected  static  void marry()
//                                                 /       public  static void marry()
                                                //            static void marry()

//                                                         protected void marry()
       {
           System.out.println("father choidece");
       }
  }
     class Childe extends Parent
  {
      public static void marry()
                                            //      protected static void marry()
                                           //       public static void marry()
                                          //      public void marry()
         {

             Parent .marry();
          System.out.println("childe choice");
      }
      public static void main(String[] args) {
                                        marry();      //                                             Childe c=new Childe();
                                                                  //            parent p=new marry();
                                                                  //           c.marry();
                                                                 //           marry();
      }
  }