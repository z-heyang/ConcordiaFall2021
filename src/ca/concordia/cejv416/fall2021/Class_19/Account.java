package ca.concordia.cejv416.fall2021.Class_19;

public class Account {

    private double startBalance;
    private double balance;
    private double interestRate;
    private double totalDeposits;
    private boolean isFrozen;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.isFrozen = false;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    public double getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(double startBalance) {
        this.startBalance = startBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(double totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public void Withdraw(double amount)
    {
        this.balance -= amount;
    }

    public void Deposit(double amount)
    {
        this.balance += amount;
        this.totalDeposits ++;
    }

}
