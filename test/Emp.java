import java.util.Scanner;

abstract class Emp
{
	String[] name; 
	String desig;
	int[] age;
	int salary;
	int record;
	Emp(){}
	Emp(int size, String desig, int salary)
	{	
		this.name = new String[size];
		this.age = new int[size];
		this.desig = desig;
		this.salary = salary;
		this.record = 0;
	}
	void create()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter name : ");
		this.name[record] = scanner.next();
		System.out.print("\nEnter age : ");
		this.age[record] = scanner.nextInt();
		this.record++;
	}
	void display()
	{
		for(int i = 0; i < this.record; i++)
		{
			System.out.print("\nName : " + this.name[i]);
			System.out.print("\nAge : " + this.age[i]);
			System.out.print("\nDesignation : " + this.desig);
			System.out.print("\nSalary : " + this.salary);
		}
	}
	void raiseSalary()
	{
		
		if(this instanceof Clerk)
		{
			this.salary += 800;
		}
		else if(this instanceof Manager)
		{
			this.salary += 1000;
		}				
		else
		{
			this.salary += 2000;
		}
		
	}
}
final class Clerk extends Emp
{
	Clerk(){}
	Clerk(int size)
	{
		super(size, "Clerk", 20000);
	}
	
	
}
final class Manager extends Emp
{	
	Manager(){}
	Manager(int size)
	{
		super(size, "Manager", 30000);
	}
}
final class Programmer extends Emp
{
	Programmer(){}
	Programmer(int size)
	{
		super(size, "Programmer", 40000);
	}
}
class Main
{
	static Scanner scanner = new Scanner(System.in);
	static void innerMenu()
	{
		System.out.print("\n1.Clerk\n2.Manager\n3.Programmer\n4.exit\nenter your choice....");
	}
	static void outerMenu()
	{
		System.out.print("\n1.create\n2.display\n3.raisesalary\n4.exit\nenter your choice....");
	}
	public static void main(String args[])
	{
		Clerk clk = new Clerk(); Manager mgr = new Manager(); Programmer pgr = new Programmer();
		int[] size = new int[3],records = new int[3];
		int outerChoice = 0,innerChoice = 0;
		boolean firstRecord = false;
		boolean[] firsts = new boolean[3];
		do
		{
			outerMenu();
			outerChoice = scanner.nextInt();
			switch(outerChoice)
			{
				case 1: 
				{
					innerMenu();
					innerChoice = scanner.nextInt();
					switch(innerChoice)
					{
						case 1: 
						{
							if(!firsts[0]) 	
							{
								System.out.print("\nenter number that you are going to store : ");
								size[0] = scanner.nextInt();
								clk = new Clerk(size[0]);
								firsts[0] = true;
							}
							if(records[0] < size[0])
							{
								clk.create();
								records[0]++;
							}
							else System.out.print("\nMax limit reached");
							break;
						}
						case 2: 
						{
							if(!firsts[1]) 	
							{
								System.out.print("\nenter number that you are going to store : ");
								size[1] = scanner.nextInt();
								mgr = new Manager(size[1]);
								firsts[1] = true;
							}
							if(records[1] < size[1])
							{
								mgr.create();
								records[1]++;
							}
							else System.out.print("\nMax limit reached");
							break;
						}
						case 3: 
						{
							if(!firsts[2]) 	
							{
								System.out.print("\nenter number that you are going to store : ");
								size[2] = scanner.nextInt();
								pgr = new Programmer(size[2]);
								firsts[2] = true;
							}
							if(records[2] < size[2])
							{
								mgr.create();
								records[2]++;
							}
							else System.out.print("\nMax limit reached");
							break;
						}
						case 4:
						default: break;
					}
					firstRecord = true;
					break;
					
				}
				case 2: if(firstRecord)
					{
						if(firsts[0]) clk.display();
						if(firsts[1]) mgr.display();
						if(firsts[2]) pgr.display();
					}
					break;
				case 3:	if(firstRecord)
					{
						if(firsts[0]) clk.raiseSalary();
						if(firsts[1]) mgr.raiseSalary();
						if(firsts[2]) pgr.raiseSalary();
					}
					break;
				case 4: System.out.print("\nexiting....");
					break;
				default: System.out.print("\nInvalid input, please enter valid input!!");
			}
		} while(outerChoice != 4);
	}
}