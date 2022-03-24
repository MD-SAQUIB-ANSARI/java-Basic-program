package ArrayBased;
public class Arry002 {
    public static void main(String[] args) {
        int arr[]=new int[]{90 , 98 , 67 ,  56  ,90  ,98 ,44 ,44 ,};
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[j]==arr[i])
                {
                    System.out.print(arr[j]);
                }
            }
            //reappt ekement in arr
        }
    }
}
