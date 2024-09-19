public class person1{
    String fName;
    String lName;
    String getFirstName(String fn)
    {
        fName = fn;
        return fName;
    }
    String getlastName(String ln)
    {
        lName = ln;
        return lName;
    }
    static class employee extends person1{
        int empId;
        String empJob;
        int getEmployeeId(int id)
        {
            empId = id;
            return empId;
        }
        String getlastName(String ln,String job)
        {
            lName = ln;
            empJob = job;
            return lName+" "+empJob;
        }
    }
    public static void main(String [] args)
    {
       employee e1 = new employee();
       System.out.println(e1.getFirstName("raju")+" "+e1.getlastName("p","clerk")+" "+e1.getEmployeeId(12));
    }
}