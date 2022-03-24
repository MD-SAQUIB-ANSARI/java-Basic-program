package RevisionForChetu;
    interface L1 {
        void show();
        interface L2 {
            void dispky();
        }
    }
    class TestDemo implements L1{
         public  void show()
         {
             System.out.println("hello");
         }
         public  void dispky()
         {
             System.out.println("hiii");
         }
        public static void main(String[] args) {
            TestDemo R=new TestDemo();
            R.dispky();
            R.show();
        }
        }

