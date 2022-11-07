public class Lab5Q10Employee {
        private  String name;
        private  double salary;
        public Lab5Q10Employee (String name,double salary)
        {
            this.name=name;
            this.salary=salary;
        }
        public Lab5Q10Employee(){
            this("",0);}
        public  String getName()
        {return  name;}
        public  double getSalary()
        {return  salary;}
        public void  raiseSalary(double byPercent)
        {
            salary=salary+salary*(byPercent/100);
        }
}
