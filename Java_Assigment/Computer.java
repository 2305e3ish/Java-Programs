public class Computer{
    public class processor{
        void displayDetails()
        {
            String brand = "samsung";
            int speed = 200;
            System.out.println(brand);
            System.out.println(speed);
        }
    }
    
    public static void main(String [] args)
    {
        Computer obj = new Computer();
        computer.processor inobj = obj.new processor();
        inobj.displayDetails();
    }
}