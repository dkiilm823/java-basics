class OuterClass {
    int outerValue = 50;
    static int staticValue = 100;

    public void displayAbc() {
        System.out.println("Outer value is " + outerValue);
    }

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static value: " + staticValue);
            // System.out.println("Outer value: " + outerValue); // Not allowed
        }
    }
}

public class StaticClassDemo {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();

        OuterClass ob1 = new OuterClass();
        ob1.displayAbc();
    }
}
