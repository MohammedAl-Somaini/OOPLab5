public class Lab5Q3BankAccountTester {
    public static void main(String[] args) {
        Lab5Q3BankAccount account = new Lab5Q3BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(400);
        System.out.println(account.getBalance());
        System.out.println("The Expected Result is 100.0");
    }

}
