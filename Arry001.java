package ArrayBased;

public class Arry001 {
    public static void main(String[] args) {
        int arr[]=new int[] {90,89,67,88,1000};
        int arr1[]=new int[]{arr.length};
        System.out.println("entr the value of array element");
        for (int i=0;i<arr1.length;i++)
            arr1[i] = arr[i];
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i]);
                   System.out.println("");
                for (int J = 0; J < arr1.length; J++) {
                    System.out.print(arr1[J]);
                }
                System.out.print(arr[i]);
            }
    }
}
