public class animal1{
    public void move()
    {
        System.out.println("animal runs");
        
    }
    
    static class cheetah extends animal1{
        public void move()
        {
            System.out.println("cheetah runs");
        }
    }

    public static void main(String [] args)
    {
        cheetah c1 = new cheetah();
        c1.move();
    }
    
}