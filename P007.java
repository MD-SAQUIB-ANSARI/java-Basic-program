package Javapackage;

public class P007 {

        public static void main(String[] args) {
            int a[][]={{67,8,98},{7,6,5},{5,4},{9,98,65,89,00,}};
//        System.out.println(   "  " +a[0].length);
//        System.out.println(   "  " +a[1].length);
//        System.out.println(   "  " +a[2].length);
//        System.out.println(   "  " +a[3].length);
            for (int i=0;i<a.length;i++)
            {
                for (int j=0;j<a[i].length;j++)
                {
                    System.out.print ( a[i][j]  +  " ");
                }
            }

        }
    }


