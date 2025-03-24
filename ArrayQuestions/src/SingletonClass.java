public class SingletonClass {

    public static SingletonClass instance = null;
    public int x = 10;

    // private default constructor
    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            System.out.println("First time instance creating!!!");
            instance = new SingletonClass();
        } else {
            System.out.println("instance already created, so simply returning the object.");
        }

        return instance;
    }
}


