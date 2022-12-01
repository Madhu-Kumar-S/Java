package typecasting;

class Student implements Cloneable
{
    void print()
    {
        System.out.println("cloning the object");
    }
    @Override
    public Student clone() throws CloneNotSupportedException
    {
            return (Student) super.clone();
    }
}
public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.print();
        Student s2 = s1.clone();
    }
}

