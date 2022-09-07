package inheritance;

// sub class
public class Student extends Teacher // extend keyword is used to link two classes
{
    private int marks;

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}
