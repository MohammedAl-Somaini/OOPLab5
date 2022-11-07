public class Lab5Q2 {

    private   int people;
    public Lab5Q2()
    {
        people=0;
    }
    public void click()
    {
        people=people+1;
    }
    public void reset()
    {
        people = 0;
    }
    public void undo()
    {if (people>0)
        people=people-1;
    }
    public   int setLimit(int maximum)
    {
        return people= Math.min(people,maximum);
    }
    public int getValue()
    {
        return people;
    }
}
