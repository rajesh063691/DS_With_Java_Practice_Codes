public class StringComparision {
    public static void main(String[] args) {
        String name="Rajesh";
        String name1="Rajesh";

        // == checks the address

        System.out.println(name==name1);

        String n1=new String("Rajesh");
        String n2=new String("Rajesh ");

        System.out.println(n1==n2);
        // equals() method checks the content
        System.out.println(n1.equals(n2));


    }
}
