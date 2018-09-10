package enkapsulacja;

public class Enkapsulacja {
    public static void main(String[] args){

        Account savingsAccount = new Account();

       // System.out.println(savingsAccount.getBalance());

        savingsAccount.setBalance(2000);
       // System.out.println(savingsAccount.getBalance());

        WithdrawReturnWrapper respond = savingsAccount.withdraw(2040);
        System.out.println(respond.message);


        savingsAccount.deposit(0);

        //System.out.println(savingsAccount.getBalance());
    }
}


class Account {

    public Account() {
        balance = 100;
    }

    private int balance;

    int getBalance () {

        return balance;
    }

    void setBalance(int balance) {
        /*
            CONDITIONS
          */
        this.balance = balance;
    }

    void deposit(int amount){

        balance += amount;
    }

    WithdrawReturnWrapper withdraw (int amountToWithdraw) {
        if(balance > amountToWithdraw) {
            setBalance(balance - amountToWithdraw);
            return new WithdrawReturnWrapper(true, amountToWithdraw, balance);
        }
        else {
            return new WithdrawReturnWrapper(false, amountToWithdraw, balance);
        }
    }





}
 class WithdrawReturnWrapper {
    String message = "";

    public WithdrawReturnWrapper(boolean isWithdrawed, int amountToWithdraw, int balance) {
        if (isWithdrawed){
            this.message = "Yoy withdrew " + amountToWithdraw;
        } else {
            this.message = "You don have enougth money. Your current balance is: " + balance +
                    " To do this operation you need: " + (amountToWithdraw - balance)  + " more";
        }
    }
}
