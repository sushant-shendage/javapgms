// package javapgms.innerclasstypes.loacalAndAnnonymousClass;

public class Driver1 {
    public static void main(String[] args) {
      Design1 d1=  new Design1(){

            @Override
            public void display() {
                 System.out.println("display");
            }

            @Override
            public void display2() {
                 System.out.println("display2");
            }

        };

        d1.display();
        d1.display2();
    }
}

interface Design1{
   void display();
   void display2();
}





