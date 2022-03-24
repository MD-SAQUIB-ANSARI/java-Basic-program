package RevisionForChetu;

public class P15 {
    public static void main(String[] args) {
        int n=12321;
        int remn;
        int  revrs=0;
        while (n!=0)
        {
            remn=n%10;
            revrs=(revrs*10)+remn;
            n=n/10;
        }
        if (revrs==n)
        {
            System.out.println(revrs);
        }
        else
        {
            System.out.println("noooooooooooooooo");
        }
    }
}
