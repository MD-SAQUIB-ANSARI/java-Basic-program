package RevisionForChetu;

public class P12 {
	public static void main(String[] args) {
		int a = 10;
		int b = -10;
		boolean p = true;
		boolean q = false;
		System.out.println(~a); /*-11 (minus of total positive value which starts from 0)*/
		System.out.println(~b); /*9 (positive of total minus, positive starts from 0)*/
		System.out.println(!p); /*false (opposite of boolean value)*/
		System.out.println(!q); /*true*/

		int x = 10;
		System.out.println(x++); //10 (11)
		System.out.println(++x); //12
		System.out.println(x--); //12 (11)
		System.out.println(--x); //10
		int a1 = 10;
		int b1 = 10;
		System.out.println(a1++ + ++a1); //10+12=22
		System.out.println(b1++ + b1++); //10+11=21
	}
}
