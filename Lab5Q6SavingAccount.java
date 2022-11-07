public class Lab5Q6SavingAccount{
        private double balance;
        private  double interest;

        public Lab5Q6SavingAccount(double balance, double interest) {
            this.balance = balance;
            this.interest = interest;
        }

        public Lab5Q6SavingAccount() {
            balance=0;
            interest=0;
        }

        public Lab5Q6SavingAccount(double balance) {
            this.balance = balance;
        }
        public void withdraw(double amount)
        {
            balance=balance-amount;
        }
        public void deposit(double amount)
        {
            balance=balance+amount;
        }

        public double getBalance() {
            return balance;
        }
        public void addInterest()
        {
            double inter=balance*interest/100;
            balance=balance+inter;

        }

    }