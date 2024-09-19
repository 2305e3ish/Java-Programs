
public class cat{
    String name;
    int age;
    public cat(){
        name = "Unknown";
        age = 0;
    }
    public static void main(String[] args)
    {
        cat obj = new cat();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
