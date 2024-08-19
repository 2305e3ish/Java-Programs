class Show {
    // Method with parameters
    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MethodPara {
    public static void main(String[] args) {
        Show obj1 = new Show();
        obj1.display("Alice", 30);
    }
}
