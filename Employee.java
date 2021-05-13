import java.util.Scanner;

public class Employee {

	int choice;
	String name = null;
	int age = 0;
	double salary = 0;
	Scanner sc = new Scanner(System.in);
	void read() {
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter salary");
		salary = sc.nextInt();
	}

	void display() {
		System.out.println("Employee details are " + name + "," + age + "," + salary);
	}

	void raiseSalary() {
		salary = salary + 5000;
		System.out.println("Salary is Raised........");
		display();
	}




	public static void main(String[] args) {

		int c;
		Employee ts = new Employee();
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
			case 1:
				ts.read();
				break;
			case 2:
				ts.display();
				break;
			case 3:
				ts.raiseSalary();
				break;
			case 4:
				System.exit(c);
			default:
				System.out.println("Please make a correct choice......");
				break;
			}
		} while (c != 1);
	}
}

