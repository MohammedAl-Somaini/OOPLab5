public class Lab5Q6SavingAccountTester {
    public static void main(String[] args) {
        Lab5Q6SavingAccount account= new Lab5Q6SavingAccount(1000,10);
        account.addInterest();
        System.out.println(account.getBalance());
    }
}
