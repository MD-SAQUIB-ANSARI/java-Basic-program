package Javapackage;

public class P009 {
    public class Arrray3 {
        public static void main(String[] args) {
            System.out.println(" chesk nthe value in aarr");
            float arr[]={65.34f,66.67f,111.222f,999.999f};
//        Scanner sc=new Scanner(System.in);
//        float s=sc.nextInt();
            float s=66.67f;
            boolean IsInArray=true;

            for (float element:arr)
            {
                if (s == arr.length) {
                    IsInArray=true;
                    break;
                }

            }
            if (IsInArray)
            {
                System.out.println("this is prsents in arra");
            }
            else
            {
                System.out.println(" this sis anot apresent is ann arr");
            }
        }
    }

}
