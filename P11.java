package RevisionForChetu;

import java.util.Scanner;

public class P11 {
   public int emplyID;
   String EMPLYname;//   OBJ KO REFERENCE V K THROU CALL NHI KR SKTE OR methods k through vhi obj nhi bana sakta
   int emplySALARY;
   float employHRA,emplyGT,emplyIT ,emplyDA;
//   P11() {
//      emplyID=0;
//      employHRA=0.0F;
//      emplyGT=0.0F;
//      emplySALARY=0;
//      emplyIT=0;           bina contor banye  bina hum print krsjte han
//      EMPLYname="";
//   }
P11() {
    emplyID=0;
    employHRA=0.0F;
    emplyGT=0.0F;
    emplySALARY=0;
    emplyIT=0;
    emplyDA=0.0f;
    String EMPLYname;
}

   void Input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value if id ");
       emplyID=sc.nextInt();
       System.out.println("enter the name");
       EMPLYname=sc.next();
           if (EMPLYname != "")
           {
               System.out.println("invalide input only character supprot");
           } else
           {
           }
       System.out.println("enter the salary");
       emplySALARY=sc.nextInt();
       System.out.println("enter the value of DA");
       emplyDA=sc.nextInt();
       System.out.println("enter the caliue od hra");
   }
   void display()
   {
       employHRA=emplySALARY*0.0f;
       emplyGT=emplySALARY+employHRA+emplyIT;
       emplyDA=emplySALARY*0.555f;
       emplyIT=emplySALARY*0.0f;
   }
    void UNITE()
    {
        System.out.println("enetr the emplyid "+emplyID);
        System.out.println("entre the value of EMPLY NAME"+EMPLYname);
        System.out.println("entrer the value of hr"+employHRA);
        System.out.println("entrg the value of GT"+emplyGT);
        System.out.println("entre the value of SALARY"+emplySALARY);
        System.out.println("entr the value ofit"+emplyIT);
    }
    public static void main(String[] args) {
        P11 R=new P11();
        R.Input();
        R.display();
        R.UNITE();
    }
            //    =====================================================================
}

