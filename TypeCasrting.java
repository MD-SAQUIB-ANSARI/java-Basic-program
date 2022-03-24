package ArrayBased;

public class TypeCasrting {
    public static void main(String[] args) {
        int myInt = 97;
        double myDouble = myInt; // Automatic casting: int to double
        char x=(char)myInt;
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        System.out.println(x);
    }
}
