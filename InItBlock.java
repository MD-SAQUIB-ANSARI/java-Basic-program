package ArrayBased;


import com.sun.source.tree.NewArrayTree;

public class InItBlock{
       float y;
    {
      float c=968;
    }
    {
        System.out.println(" dusra block init");
    }

    {
        System.out.println(" this is a int block");     //this is a intblock
    }

    InItBlock()
    {
        System.out.println(" this is nono RGUMENT VALUE");
    }
    InItBlock(int x)
    {
        System.out.println("this is a argeument vkaue");
    }
    public static void main(String[] args) {
        System.out.println(" anather blocke is ani block");
        InItBlock r=new InItBlock();
        InItBlock R1= new InItBlock(3767);
        InItBlock R3=new InItBlock(20000);
    }
}



