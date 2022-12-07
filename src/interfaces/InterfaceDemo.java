package interfaces;

interface MyInter
{
    void connect();
    void disconnect();
}
class Oracle implements MyInter
{
    public void connect()
    {
        System.out.println("Connected to oracle database...");
    }
    public void disconnect()
    {
        System.out.println("Disconnected from oracle database...");
    }
}
class MySQL implements MyInter
{
    public void connect()
    {
        System.out.println("Connected to mysql database...");
    }
    public void disconnect()
    {
        System.out.println("Disconnected from mysql database...");
    }
}
public class InterfaceDemo
{
    public static void main(String[] args) throws Exception {
//        Class c = Class.forName(args[0]);
//        MyInter mi = (MyInter) c.newInstance();
        MyInter mi;
        mi = new Oracle();
        mi.connect();
        mi.disconnect();
        mi = new MySQL();
        mi.connect();
        mi.disconnect();
    }
}
