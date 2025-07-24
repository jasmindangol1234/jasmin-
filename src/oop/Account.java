class Account{
    private String accountNumber:
    private double balance;
    public Account(String accNo){
        this.accountNumber = accNo;
        this.balance = 0.0;
    }
    public Account(String accNo, double balance){
        this.accountNumber = accNo;
        this.balance = balance;
    }
    public StringgetAccountNumber(){
        return accountNumber;
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double account){
        if(account > 0) balance += account;
    }
    public void withdraw(double amount){
        if (account > 0 && amount <= balance) balance -= amount; 
    }
    public void displayAccountDetails()
    {
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance: $ "+balance);
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Account " + accountNumber +"is closed.");   
        super.finalize();
            }
}