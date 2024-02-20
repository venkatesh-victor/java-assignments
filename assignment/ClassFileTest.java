class ClassA {
    public void testMethod() {
        System.out.println("Testing... Testing... Testing");
    }
}

class ClassB {
    public void testMethod() {
        System.out.println("Testing again...");
    }
}

class ClassC {
    public void testMethod() {
        System.out.println("Once again, testing.");
    }
}

public class ClassFileTest {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.testMethod();
        b.testMethod();
        c.testMethod();
    }
}
