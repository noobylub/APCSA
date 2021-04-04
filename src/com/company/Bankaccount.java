
//Fadi Masanat and Muhammad Mushoffa
package com.company;
class BankAccount{
    int balance;
    String name;
    public BankAccount(String name, int balace){
        this.balance=balace;
        this.name= name;

    }
    public BankAccount(String name){
        this.name=name;
        this.balance=0;
    }
    //deposit
    public void deposit(int n){
        this.balance+=n;

    }
    public int getBalance(){
        return this.balance;
    }

    //withdraw
    public void withdraw(int n){
        this.balance-=n;
    }
    public void Display(){
        System.out.println("owner of this account is " + this.name );
        System.out.println("Balance of this bank account is "+ this.balance);
    }

}
class InterestAccount extends BankAccount{
    double interest;
    public InterestAccount(String name, int balance, double interest){
        super(name,balance);
        this.interest = interest;
    }
    public void addInterest(){
        super.balance*=(1+this.interest);
        System.out.println("Your new balance is "+ super.balance);
    }
}
class CreditCard extends InterestAccount{
    public CreditCard(String name, int balance, double interest ){
        super(name,balance,interest);
    }
    public void gatherInterest(){
        super.addInterest();
        super.balance-=10;
        System.out.println("Balance for "+ super.name+ " is now "+ super.balance);
        System.out.println("Thank you for using our Credit Card");

    }

}
class GreatAccount extends InterestAccount{
    int month;
    public GreatAccount(String name, int balance, double interest, int month){
        super(name, balance, interest);
        this.month = month;
    }
    public void addMonth(){
        if(this.month%12==0){
            this.month=0;
        }
        this.month++;

    }
    public void withDraw(int n){
        if(this.month%3==0){
            super.balance-=n;
            System.out.println("Your new balance is "+ super.balance);
            System.out.println("Thank you for using our special card");
        }
        else{
            System.out.println("Unable to, three months have not passed yet");
        }
    }


}

class mainClass{
    public static void main(String[] args) {
        GreatAccount first = new GreatAccount("Steve", 1100,12,12);

         //does not works as intended
        first.withDraw(100);
        first.addMonth();
        first.addMonth();
        first.withDraw(100);
        System.out.println();
        System.out.println();
        CreditCard credit = new CreditCard("Steve II", 100,0.05);
        credit.gatherInterest();

        System.out.println();
        System.out.println();
        InterestAccount interest = new InterestAccount("BYME", 200,0.05);
        interest.addInterest();
        interest.deposit(100);
        interest.addInterest();
        System.out.println();
        System.out.println();
        BankAccount banking = new BankAccount("Bobby", 20);
        banking.withdraw(10);
        banking.deposit(1000);
        banking.Display();

    }
}