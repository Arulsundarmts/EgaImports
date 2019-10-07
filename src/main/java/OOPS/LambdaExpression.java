package OOPS;

interface Integration {
    void contact();
}

public class LambdaExpression {
    public static void main(String[] args) {

//                Integration obj1 = new Integration() {
//                    public void contact() {
//                        System.out.println("I am the contact from Insurance policy");
//
//                    }
//                };
//        obj1.contact();

        Integration obj1 = () -> System.out.println("I am the contact from Insurance policy");

        obj1.contact();
    }
}
