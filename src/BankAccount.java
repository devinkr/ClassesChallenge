public class BankAccount {

    private int accountNum;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNum, String name, String email, String phone) {
        System.out.println("Constructor with params called");
        this.balance = 0;
        this.accountNum = accountNum;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
