package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        //1. 만원 입금
        account.deposit(10000);
        //2. 9000원 출금
        account.withdraw(9000);
        //3. 2000원 출금 -> 잔액 부족.
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
