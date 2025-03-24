package java8.lamda_expressions;


// Inrterface
interface MyFunction {

    // Method inside the interface
    void func();
}

public class ModifyLocalUsingLambda {
    // Custom initialization
    int data = 170;

    public static void main(String[] args) {

        int val = 10;
        ModifyLocalUsingLambda obj = new ModifyLocalUsingLambda();
        MyFunction myinter = () -> {

            int localVal = val + 90;
            System.out.println(localVal);

            //val=5;
            System.out.println(val);

            System.out.println(obj.data);
            obj.data += 500;
            System.out.println(obj.data);

        };

        myinter.func();
        obj.data += 200;
        System.out.println(obj.data);
    }
}
