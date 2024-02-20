public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Values before swaping:-");
        System.out.println("a: " + a + " b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after Swaping:-");
        System.out.println("a: " + a + " b: " + b);
    }
}
