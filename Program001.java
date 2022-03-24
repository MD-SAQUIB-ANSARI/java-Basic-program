package P001;

public class Program001 {

        public static void main(String[] args) {

//            // declare variables
//            int a = 12, b = 5;
//
//            // addition operator
//            System.out.println("a + b = " + (a + b));
//
//            // subtraction operator
//            System.out.println("a - b = " + (a - b));
//
//            // multiplication operator
//            System.out.println("a * b = " + (a * b));
//
//            // division operator
//            System.out.println("a / b = " + (a / b));
//
//            // modulo operator
//            System.out.println("a % b = " + (a % b));
//        }



//                public static void main(String[] args) {


            // create variables
            int a = 4;
            int var;

            // assign value using =
            var = a;
            System.out.println("var using =: " + var);

            // assign value using =+
            var += a;
            System.out.println("var using +=: " + var);

            // assign value using =*
            var *= a;
            System.out.println("var using *=: " + var);


            // && operator
            System.out.println((5 > 3) && (8 > 5));  // true
            System.out.println((5 > 3) && (8 < 5));  // false

            // || operator
            System.out.println((5 < 3) || (8 > 5));  // true
            System.out.println((5 > 3) || (8 < 5));  // true
            System.out.println((5 < 3) || (8 < 5));  // false

            // ! operator
            System.out.println(!(5 == 3));  // true
            System.out.println(!(5 > 3));  // false

            // declare variables
            int a1 = 12, b = 12;
            int result1, result2;

            // original value
            System.out.println("Value of a: " + a1);

            // increment operator
            result1 = ++a1;
            result1=a1++;
            System.out.println("After increment: " + result1);

            System.out.println("Value of b: " + b);

            // decrement operator
            result2 = --b;
            result2=b--;
            System.out.println("After decrement: " + result2);
        }
    }





}
