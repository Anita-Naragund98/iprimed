import java.util.*;

class employee
{
    Scanner s=new Scanner(System.in);
    int emp_id;
    String empname;
    /*void getdata()
    {
        System.out.println("enter name::");
        empname=s.next();
        System.out.println("enter empid::");
        emp_id=s.nextInt();
    }*/
}
class salary extends employee
{
    //Scanner s=new Scanner(System.in);
    double monthly_salary;
    String designation;
    salary(double monthly_salary,String designation,int emp_id,String empname)
    {
       this.emp_id=emp_id;
       this.empname=empname;
       this.designation=designation;
       this.monthly_salary=monthly_salary;
    }   
    void condition()
    {
        System.out.println("monthly salary is:"+monthly_salary);
        if(monthly_salary>20000)
        {
            System.out.println("name of employee is::"+empname);
            System.out.println("id of employee is::"+emp_id);
            System.out.println("monthly salary is::"+monthly_salary);
            System.out.println("designation of employee is::"+designation);
        }
        else
        {
            System.out.println("Cannot display details....");
        }
    }
    
}
 class hierarchial1 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int id,i;
        String name,desig;
        double sal;
        for(i=0;i<3;i++)
        {
            System.out.println("enter id of employee..");
            id=s.nextInt();
            System.out.println("enter name of employee..");
            name=s.next();
            System.out.println("enter designation of employee...");
            desig=s.next();
            System.out.println("enter salary of employee");
            sal=s.nextDouble();
            salary x=new salary(sal,desig,id,name);
            x.condition();
        }    
       //salary x=new salary(sal,desig,id,name);
      // x.condition();
    }
    
}