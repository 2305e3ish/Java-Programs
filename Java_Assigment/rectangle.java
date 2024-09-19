public class rectangle {
    private int length;
    private int width;

    // Constructor
    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for width
    public int getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(int width) {
        this.width = width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        rectangle rect = new rectangle(10, 5);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());

        rect.setLength(15);
        rect.setWidth(10);
        System.out.println("Updated Length: " + rect.getLength());
        System.out.println("Updated Width: " + rect.getWidth());
    }
}