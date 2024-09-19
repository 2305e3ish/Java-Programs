public class shape{
    int length,breadth;
    public void getArea(int length,int breadth)
    {
        System.out.println(length*length*breadth);
    }
    
    static class rectangle extends shape{
        public void getArea(int length,int breadth)
        {
            System.out.println(length*breadth);
        }
    }
    public static void main(String [] args)
    {
        rectangle s1 = new rectangle();
        s1.getArea(5,5);
    }
}