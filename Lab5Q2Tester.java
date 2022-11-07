import java.util.Scanner;
public class Lab5Q2Tester {

        public static void main(String[] args) {
            int people,p1;
            Scanner in=new Scanner( System.in);
            Lab5Q2 click=new Lab5Q2();
            System.out.println("Enter Number of People:");
            p1=in.nextInt();
            System.out.println("Enter 1 for Counting or -1 for Undo or 0 For Resent. " );
            System.out.println("If You Want to Exit Enter 2): ");
            people=in.nextInt();
            while (people!=2)
            {
                if (people==1) {
                    click.click();
                    System.out.println("The People Are "+click.setLimit(p1));
                }
                if (people==0) {
                    click.reset();
                    System.out.println("The People Are "+click.getValue());     }
                if (people==-1)
                {
                    click.undo();
                    System.out.println("tThe People Are "+click.getValue());
                }
                people=in.nextInt();
            }
        }
    }
