package ca.concordia.cejv416.fall2021.Class_19;

public class CheckingAccount extends Account {

    public CheckingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    public void Withdraw(double amount)
    {
        if (amount > 100.00)
        {
            this.setFrozen(true);
        }
        else
        {
            super.Withdraw(amount);
        }

    }


}
