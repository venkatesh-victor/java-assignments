public class TypeConversionsDemo {
    public static void main(String[] args) {
        int intValue = 42;
        long longValue = intValue; 
        System.out.println("int to long");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println();

        float floatValue = 3.14f;
        double doubleValue = floatValue;
        System.out.println("float to double");
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println();

        byte byteValue = 100;
        short shortValue = byteValue;
        System.out.println("byte to short");
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println();

        int val = 64;
        char charVal = (char) val;
        System.out.println("int to char");
        System.out.println("int value: " + val);
        System.out.println("char value: " + charVal);
    }
}

