import java.util.*;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new NationalizedBank("SBI", "CG");

        Account acc1 = new SavingsAccount("ACC101", "Rahul", 8500);
        Account acc2 = new CurrentAccount("ACC102", "Priya", 12000);
        Account acc3 = new LoanAccount("ACC103", "Arjun", 30000);

        bank.openAccount(acc1);
        bank.openAccount(acc2);
        bank.openAccount(acc3);

        acc1.deposit(500);
        acc2.withdraw(2000);

        bank.displayBankInfo();
        scanner.close();
    }
}