class Checking {
    int x;

    // Constructor with parameters
    Checking(int y) {
        x = y;
    }
}

public class ConstWithPara {
    public static void main(String[] args) {
        Checking obj = new Checking(10);
        System.out.println("Value of x: " + obj.x);
    }
}
