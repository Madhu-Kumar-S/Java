package inheritance;

public class Teacher // Super class
{
    private String name;
    private int id;
    private int age;
    private float sal;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setSal(float sal)
    {
        this.sal = sal;
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public float getSal() {
        return sal;
    }
}
