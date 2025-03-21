package basicprogram;


class dad {
   int bankbalance = 5000;
   int gavetoson = 3000;;
}

class son extends dad {
      int received =3000;
      int expence =1100;
      int balance = received - expence;
}

public class inheritancedemo {
    public static void main(String[] args) {

      son s1 =new son();
        System.out.println("From dad ");
        System.out.println(" Balance is :  " + s1.bankbalance);
        System.out.println(" Money Gave to  son is : " + s1.gavetoson);
        System.out.println("From son");
        System.out.println(" Received amount is : " + s1.received);
        System.out.println(" Money expence is : " + s1.expence);
        System.out.println(" Remaining balance is : " + s1.balance);

    }
}
