import java.util.*;

public class CooperativeBank extends Bank {
    private List<Account> accounts = new ArrayList<>();

    public CooperativeBank(String bankName, String branchName) {
        super(bankName, branchName);
    }

    @Override
    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened successfully in Cooperative Bank.");
    }

    @Override
    public void displayBankInfo() {
        System.out.println("--- Bank Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branchName);
        System.out.println("Bank Code: " + getBankCode());
        for (Account acc : accounts) {
            acc.showAccountType();
            System.out.println("Holder: " + acc.holderName);
            System.out.println("Account Number: " + acc.accountNumber);
            System.out.println("Balance: ₹" + acc.getBalance());
        }
    }
}