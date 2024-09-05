public class BankAccount {
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdraw(double amount){
        double newTotal = getBalance() - amount;
        if(newTotal < 0){
            System.out.println("Unable to withdraw. Account balance would be: " + newTotal);
        } else {
            setBalance(newTotal);
            System.out.println("Success! New Balance: " + getBalance());
        }
    }

    public void deposit(double amount){
        double newTotal = getBalance() + amount;
        setBalance(newTotal);
        System.out.println("Success! New Balance: " + getBalance());
    }

    
}
