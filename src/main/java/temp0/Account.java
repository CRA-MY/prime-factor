package temp0;

public class Account {
    public double welfareRate = 1.05;
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public void welfare() {
        balance *= welfareRate;
    }

    public void setWelfareRate(double welfareRate) {
        this.welfareRate = welfareRate;
    }

    public double getWelfareRate() {
        return welfareRate;
    }

    public int expectBalance(int n) {
        int result = balance;
        for (int i = 0; i < n; i++) {
            result *= welfareRate;
        }
        return result;
    }
}
