public class Lab5Q4 {
        private double balance,rate;


        public Lab5Q4()
        {
            balance=0;
        }
        public Lab5Q4 (double initialBalance)
        {
            balance=initialBalance;
        }
        public  void addInsert(double rate)
        {
            balance=balance+balance*(rate/100);
        }
        public  double getBalance()
        {
            return balance;
        }
}
