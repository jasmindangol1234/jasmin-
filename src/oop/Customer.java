package oop.task1;

publicclass{
    private String name;
    private int age;
    private Account account;
    //constructor Overloading
    Customer(){
        this.name = "Unknown";
        this.age = 0;
        this.account = new Account();
    }
    Customer(String name, int age, Account account){
        this.name = name;
        this.age = age;
        this.account = account;
    }
    public String getName(){
        return Name;
    }
    public String getAge(){
        return Age;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account account){
    this.account = account;
    }
    public void displayCustomerDetails(){
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        if (account != null){
            account.displayAccountDetails();
        }
        else{
            System.out.println("No account associated.");
        }
    }
}