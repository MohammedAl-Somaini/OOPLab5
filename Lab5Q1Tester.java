public class Lab5Q1Tester {
    public static void main(String[] args) {
        Lab5Q1 c= new Lab5Q1();
        System.out.println("Counter After Building "+c.getValue());
        c.click();
        c.click();
        c.click();
        System.out.println("Counter After Three Clicks "+c.getValue());
        c.undo();
        c.undo();
        c.undo();
        c.undo();

        System.out.println("Counter After The Undo "+c.getValue());
        c.reset();
        System.out.println("Counter After Reset "+c.getValue());
        System.out.println("Call Math.max "+Math.max(1, 0));
    }
}
