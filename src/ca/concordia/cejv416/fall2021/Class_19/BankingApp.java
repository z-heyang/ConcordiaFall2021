package ca.concordia.cejv416.fall2021.Class_19;

public class BankingApp {

    public static void main(String[] args) {

        CheckingAccount c = new CheckingAccount(5.00, 0.01);

        SavingAccount s = new SavingAccount(0, 0.05);

        System.out.println(c.isFrozen());
        System.out.println(s.isFrozen());

        s.setFrozen(true);

        System.out.println(c.isFrozen());
        System.out.println(s.isFrozen());



//        c.Withdraw(120);

//        s.Withdraw(100);






    }
}
