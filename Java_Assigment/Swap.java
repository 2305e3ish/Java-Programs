public class Swap {
    public static void main(String[] args) {
        int a = 12, b = 15;

        // Using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Using third variable: a = " + a + ", b = " + b);

        // Without using third variable
        a = 5; b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Without using third variable: a = " + a + ", b = " + b);
    }
}
