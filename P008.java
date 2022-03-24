package Javapackage;

public class P008 {
    public class Array4 {
        public static void main(String[] args) {


            int a[][] = {{90, 90, 80, 70,}, {20, 30, 40, 50,}};
            int b[][] = {{2, 3, 4, 5,}, {6, 7, 8, 9}};
            int aa[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}};
            for (int i=0;i<a.length;i++)
            {

                for (int j=0; j< a[i].length;j++)
                {
                    aa[i][j]=a[i][j]+b[i][j];
                    System.out.format(+i+  "  " +j);
                    System.out.print(aa[i][j]);
                }
                System.out.println("");

            }
        }
    }






}
