package inheritance;


//  Deriving a new class(sub class) from already existing class(super class) such that new class acquires all the features of
//  the already existing class is called inheritance
//  provides code reusablitiy i.e class reuse
//  when a object to a student class is created it contains a copy of a teachers class
//  Super class members are avilabe to the sub class because subclass contains a copy of the super class object


public class TeacherStudent {
    public static void main(String[] args)
    {
        Teacher t = new Teacher();
        System.out.println("Teacher Details");
        t.setName("Alan");
        t.setId(2);
        t.setAge(28);
        t.setSal(1000000.0f);

        System.out.println("Teachers Name: "+t.getName());
        System.out.println("Teachers Id: "+t.getId());
        System.out.println("Teachers Age: "+t.getAge());
        System.out.println("Teachers Salary: "+t.getSal());

        Student s = new Student();
        System.out.println("Student Details");
        s.setName("Elon");
        s.setId(21);
        s.setAge(22);
        s.setMarks(500);

        System.out.println("Students Name: "+s.getName());
        System.out.println("Students Id: "+s.getId());
        System.out.println("Students Age: "+s.getAge());
        System.out.println("Students Salary: "+s.getMarks());

    }
}
