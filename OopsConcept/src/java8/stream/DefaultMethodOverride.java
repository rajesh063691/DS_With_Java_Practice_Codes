package java8.stream;

@FunctionalInterface
interface TestDefaultMethod{
    public void show();

    public static void print(){
        System.out.println("Hello");
    }
}

public class DefaultMethodOverride implements TestDefaultMethod {

    @Override
    public void show() {
        System.out.println("Hello form Inside overridden method");
    }

   // @Override
    public static void print() {
        System.out.println("Hello 2 form Inside overridden method");
    }

    public static void main(String[] args) {
        DefaultMethodOverride m = new DefaultMethodOverride();
        m.show();
        DefaultMethodOverride.print();
    }
}
