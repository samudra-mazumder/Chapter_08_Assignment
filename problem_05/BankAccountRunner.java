package problem_05;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("01","Akib",300);

        BankAccount depositBankAccount1 = bankAccount1.deposit(5);
        System.out.println("New balance of bankAccount1 after deposit is : " + depositBankAccount1.getBalance());

        BankAccount withdrawBankAccount1 = bankAccount1.withdraw(36);
        System.out.println("New balance of bankAccount1 after withdraw is : " + withdrawBankAccount1.getBalance());
    }
}