public class Message {
    public static void main(String[] args) {
        message();
    }

    static void message(){
        System.out.println("Hello World");
        message1();
        System.out.println("message() call completed");
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
        System.out.println("message1() call completed");
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
        System.out.println("message2() call completed");
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
        System.out.println("message3() call completed");
    }
    static void message4(){
        System.out.println("Hello World");
    }
}