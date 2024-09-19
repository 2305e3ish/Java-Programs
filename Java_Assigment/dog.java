public class dog{
    String name;
    String colour;
    public dog(String n , String c) {
        name = n;
        colour = c;
    }
    public static void main(String [] args)
    {
        dog obj = new dog("nine","black");
        System.out.println(obj.name);
        System.out.println(obj.colour);
    }
}