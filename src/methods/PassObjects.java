package methods;
class Employee
{
    int id;
    Employee(int id)
    {
        this.id=id;
    }
}

class Swap2
{
    void swap(Employee obj1, Employee obj2)
    {
        Employee temp;
        temp = obj1;
        obj1 = obj2;
        obj2 = temp;
    }
}

public class PassObjects {
    public static void main(String[] args)
    {
        Employee obj1 = new Employee(10);
        Employee obj2 = new Employee(20);
        System.out.println(obj1.id+"\t"+obj2.id);
        Swap2 s2 = new Swap2();
        s2.swap(obj1,obj2);

        System.out.println(obj1.id+"\t"+obj2.id);

    }
}
