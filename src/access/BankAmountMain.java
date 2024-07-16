package access;

public class BankAmountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);//10000원 입금
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
