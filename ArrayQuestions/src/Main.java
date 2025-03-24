// Driver Class
public class Main
{
    public static void main(String args[])
    {
        SingletonClass a = SingletonClass.getInstance();
        SingletonClass b = SingletonClass.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}