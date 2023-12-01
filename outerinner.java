// Outer class
class Outer {
    private int outerField = 10;

    // Nested class
    static class NestedStatic {
        void display() {
            System.out.println("NestedStatic class method");
        }
    }

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class method, outerField: " + outerField);
        }
    }
}

public class NestedClassesExample {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        Outer outerObject = new Outer();

        // Creating an instance of the nested static class
        Outer.NestedStatic nestedStaticObject = new Outer.NestedStatic();
        nestedStaticObject.display();

        // Creating an instance of the inner class
        Outer.Inner innerObject = outerObject.new Inner();
        innerObject.display();
    }
}
