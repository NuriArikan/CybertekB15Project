package day40;

public class BankAccount {


        String accountType;
        String accountHolder;
        long accountNumber;
        double balance;

        // setAllTheValue
        public void setAllTheValue ( String newAccountType , String newAccountHolder ,
                                     long newAccountNumber, double newBalance ){
            accountType=newAccountType;
            accountHolder=newAccountHolder;
            accountNumber=newAccountNumber;
            balance = newBalance;
        }

        // showAccountBalance
        public void showAccountBalance () {
            System.out.println("current balance = " + balance);
        }

        // showAccountHolderAccountType
        public void showAccountHolderAccountType(){
            System.out.println("Account type is  " + accountType + " Account holder is " + accountHolder);
        }

        // getBalance   return the balance
        public double getBalance (){
            return balance;
        }

        // deposit  ( amount )
        public void deposit (double amount){
            balance = balance + amount;
        }


        // withdraw ( amount )
        public void withdraw ( double amount ){
            balance = balance - amount;
        }

        // withdraw100Cash ()
        public void withdraw100Cash () {
            withdraw(100);
        }

        // purchaseProduct ( ProductPrice , count )
        public void purchaseProduct (double productPrice, int count){

            double totalPrice = productPrice * count;
            balance -= totalPrice;
        }

        // toString
        public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
