package RevisionForChetu;
abstract  class InertFace {
    abstract void show();
        interface I {
            abstract void display();
        }
    }
class TestRider extends InertFace{
   public void show()
    {
        System.out.println("this is a interface and abstraection class is used");
    }
    public void diplay()
    {
        System.out.println("this anther class of interface os");
    }
    public static void main(String[] args) {
        TestRider R=new TestRider();
        R.show();
        R.diplay();

    }
}

