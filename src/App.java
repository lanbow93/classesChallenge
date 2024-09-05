public class App {
    public static void main(String[] args) throws Exception {
        BankAccount Lewis = new BankAccount();
        BankAccount Clark = new BankAccount();
        
        Lewis.setAccountNumber(123456789);
        Clark.setAccountNumber(112233445);
        Lewis.setName("Lewis");
        Clark.setName("Clark");
        Lewis.deposit(500);
        Clark.withdraw(50);
        Lewis.withdraw(150);
    }
}
