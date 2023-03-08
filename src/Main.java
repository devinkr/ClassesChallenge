public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, "Devin Raleigh", "d@example.com", "555-5555");

//        account.setAccountNum(12345);
//        account.setBalance(1000);
//        account.setName("Devin Raleigh");
//        account.setEmail("d@example.com");
//        account.setPhone("555-5555");

        System.out.println("Balance: " + account.getBalance());
        account.deposit(2000);

        System.out.println("New Balance: " + account.getBalance());

        System.out.println("Name: " + account.getName() +
                        "\nAccount: " + account.getAccountNum() +
                        "\nEmail: " + account.getEmail() +
                        "\nPhone: " + account.getPhone());

        account.withdraw(5000);
        account.withdraw(1500);
        System.out.println("New Balance: " + account.getBalance());

    }
}
