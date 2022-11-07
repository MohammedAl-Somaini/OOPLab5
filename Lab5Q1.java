public class Lab5Q1 {
        private int value;
        public Lab5Q1 ()
        {value =0;}
        public void click ()
        {value+=1;}
        public int getValue()
        {return value;}
        public void reset ()
        {value=0;}
        public void undo ()
        {
            if (value>0)
                value-=1;
            else      value=0;
        }}
