package StringBased01;

public class DeletArrayElement {
    public static void main(String[] args) {
        int arr[]={24,54,67,89,88,90};
        int delet=54;
        for(int i=0;i<=arr.length;i++) {
            if (delet == arr[i]) {
                for (int j = i; j <= arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
