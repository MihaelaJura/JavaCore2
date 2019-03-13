package Task9_Money;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest() {
        System.out.println("Current savings balance: " + savingsBalance);
        double monthlyInterest;
        if(savingsBalance<=0){
            annualInterestRate=annualInterestRate/2;
            monthlyInterest = (savingsBalance * annualInterestRate) / 12;
            savingsBalance = savingsBalance- monthlyInterest;
            System.out.println("New savings balance: " + savingsBalance);}
       else{
           monthlyInterest = (savingsBalance * annualInterestRate) / 12;
           savingsBalance = savingsBalance+ monthlyInterest;
           System.out.println("New savings balance: " + savingsBalance);}
    }

    public double getBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}

class Driver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount saver3 = new SavingsAccount(-2000);
        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();

        saver3.calculateMonthlyInterest();


    }
}
