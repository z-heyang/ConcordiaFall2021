package ca.concordia.cejv416.fall2021.Class_13.Entities;

import java.math.BigDecimal;

public class CommissionEmployee extends SalaryEmployee {

    private BigDecimal commissionRate;

    public CommissionEmployee(int id, String name, BigDecimal yearlySalary, BigDecimal commissionRate) {
        super(id, name, yearlySalary);
        this.commissionRate = commissionRate;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public BigDecimal calculatePay()
    {
        BigDecimal monthlyPay = super.calculatePay().multiply(this.commissionRate);

        determineOnlinePay(monthlyPay);

        return monthlyPay;
    }
}
