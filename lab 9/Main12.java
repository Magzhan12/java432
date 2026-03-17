class Bank {
    static double interestRate = 0.1;

    static double calculateInterest(double amount) {
        return amount * interestRate;
    }
}

public class Main12 {
    public static void main(String[] args) {
        System.out.println(Bank.calculateInterest(1000));
    }
}