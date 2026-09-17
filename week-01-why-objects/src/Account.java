/*
 * Week 1 - Why objects
 *
 * The first class of the course. Two ideas in ten lines:
 * the data is private, and the rule about it lives right beside it.
 *
 * Week 2 builds this properly. Today it only has to make the point.
 */
public class Account {

    private double balance;

    public Account(double openingBalance) {
        this.balance = openingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}