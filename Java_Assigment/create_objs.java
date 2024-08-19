class MyClass {
    int x = 5;
}

public class create_objs {
    public static void main(String[] args) {
        // Creating multiple objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
