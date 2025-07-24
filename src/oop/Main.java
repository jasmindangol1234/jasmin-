public class Main {
    public static void main(String[]args){
        Bank bank = new Bank("OpenAI Bank");
        //Customer with account 
        Account acc1 = new Account("123",1000);
        Customer customer1 = new Customer("jasmin","jasmin@example.com",acc1);
        customer customer2 = new customer("nishma","nishma@example.com");
        Account acc2 = new Account("B456");
        acc2.deposit(500);
        customer2.setAccount(acc2);
        System.out.println("=== Bank:" + bank.getBankName() + "===");
        System.out.println("\n--- Customer 1 ---");
        customer1 .displayCustomerDetails();
        System.out.println("\n--- Customer2 ---");
        customer2.displayCustomerDetails();
        //Suggest garbage collection to trigger finalize()
        acc1 = null;
        acc2 = null;
        System.gc();
    }
}
