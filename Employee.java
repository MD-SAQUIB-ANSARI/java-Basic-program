package Staticblock;

public class Employee {
    int x;
    static  int y;
    void  show()
    {
        x=x+1;
        y=y+1;
        System.out.println(x+   " \n  or  "+y);
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.show();
//        Employee emp1=new Employee();      aisa vhi krtekste hain
//        emp1.show();
//        Employee ee=new Employee();
//        ee.show();
    }

}
