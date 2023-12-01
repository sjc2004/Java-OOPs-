// Outer interface
interface OuterInterface {

    // Nested interface
    interface NestedInterface {
        void nestedMethod();
    }
}

// Another class implementing the nested interface
class ImplementingClass implements OuterInterface.NestedInterface {

    // Implementing the method from the nested interface
    @Override
    public void nestedMethod() {
        System.out.println("Implemented nested method");
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the implementing class
        ImplementingClass obj = new ImplementingClass();

        // Calling the method from the nested interface
        obj.nestedMethod();
    }
}
