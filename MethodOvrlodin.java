package RevisionForChetu;
public class MethodOvrlodin {
    void  show(int x,String str)
    {
        System.out.println(x+"\n"+str);
    }
    void show( String st,float x1)
    {
        System.out.println(st+ "\n  " +x1);
    }
}
class A
{
    public static void main(String[] args) {
        MethodOvrlodin R=new MethodOvrlodin();
        R.show(323,"SAQUIB");
        R.show("rosee",8787.656f);
    }
}
