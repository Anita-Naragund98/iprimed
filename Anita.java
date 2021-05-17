import java.util.Scanner;

public class Anita {
	int empId;
	String name;
	int age;
	float salary;

	public void create() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee id : ");
		empId = sc.nextInt();
		System.out.print("Enter the name : ");
		name = sc.next();
		System.out.print("Enter the age : ");
		empId = sc.nextInt();
		System.out.print("Enter the salary : ");
		salary = sc.nextFloat();
	}

	public void display() {

		System.out.println("Employee id = " + empId);
		System.out.println("Employee name = " + name);
		System.out.println("Employee id = " + age);
		System.out.println("Employee salary = " + salary);
	}

	public void raiseSalary() {
		salary += 5000;
		System.out.println("Salary is raised...........");
		display();
	}
	public static void main(String[] args) {
		int c;
		Anita ts[] = new Anita[3];
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.RaiseSalary");
		System.out.println("4.Exit");
		System.out.println("Enter choice");
		c = sc.nextInt();
		if(c==4)
		break;
			switch (c) {
			case 1:for (int i = 0; i <3; i++) {
				ts[i] = new Anita();
				ts[i].create();
			}
				break;
			case 2:
				System.out.println("**** Data Entered as below ****");
				for (int i = 0; i <3; i++) {
					ts[i].display();
				}
				break;
			case 3:
				for (int j = 0; j <3; j++) {
					ts[j].raiseSalary();
				}
				break;
			case 4:
				if(c==4)
				System.exit(c);
			default:
				System.out.println("Please make a correct choice......");
				break;
			}
		} while (c != 1);
	}

}