/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinki
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance < 2.60) {
            this.balance += 0;
        } else {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance < 4.60) {
            this.balance += 0;
        } else {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {
        double sum = this.balance + amount;
        if(sum > 150) {
            this.balance = 150;
        } else if (amount < 0) {
            this.balance += 0;
        } else {
            this.balance = sum;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
