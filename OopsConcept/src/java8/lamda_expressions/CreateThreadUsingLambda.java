package java8.lamda_expressions;

public class CreateThreadUsingLambda {

    public static void main(String[] args) {
        Runnable r = () -> {
            // this is basically a run method
           // Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        };
        System.out.println(Thread.currentThread().getName()+ " is running");

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
