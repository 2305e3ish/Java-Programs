class Addition {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }
}

public class add {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int sum = addition.add(5,3);
        System.out.println("Sum: " + sum);
    }
}
