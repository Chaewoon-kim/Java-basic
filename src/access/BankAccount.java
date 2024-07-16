package access;

public class BankAccount {
    //데이터는 전부 private
    //기능(메서드)는 필요한 것만 public으로....
    private int balance;

    public BankAccount(){
        balance = 0;
    }

    //public 메서드: deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드: withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드: 최종금액
    public int getBalance(){
        return balance;
    }

    //private 메서드: 금액확인
    private boolean isAmountValid(int amount){
        return amount > 0; // 금액이 0보다 커야함.
    }
}
