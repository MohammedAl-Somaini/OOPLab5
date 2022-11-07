public class Lab5Q3BankAccount {

        private double balance;
        public Lab5Q3BankAccount()
        {
            balance=0;
        }
        public Lab5Q3BankAccount(double initialBalance)
        {
            balance=initialBalance;
        }
        public void deposit (double balance)
        {
            this.balance=this.balance+balance;
        }
        public void withdraw(double balance)
        {
            this.balance=this.balance-balance;
        }
        public  double getBalance()
        {
            return balance;
        }
    }
