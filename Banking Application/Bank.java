public abstract class Bank {
    protected String bankName;
    protected String branchName;
    private static int bankCounter = 1;
    public static final String BANK_CODE_PREFIX = "BANK-";
    private String bankCode;

    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.bankCode = generateBankCode();
    }

    private String generateBankCode() {
        return BANK_CODE_PREFIX + String.format("%03d", bankCounter++);
    }

    public abstract void openAccount(Account account);
    public abstract void displayBankInfo();

    public String getBankCode() {
        return bankCode;
    }
}