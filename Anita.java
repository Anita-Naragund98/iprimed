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
		int c, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		n = sc.nextInt();
		Sunita ts[] = new Sunita[n];
		boolean b = false;
		do {
			System.out.println("1.Create");
			System.out.println("2.Display");
			System.out.println("3.RaiseSalary");
			System.out.println("4.Exit");
			System.out.println("Enter choice");
			c = sc.nextInt();
			if (c == 4)
				break;
			switch (c) {
			case 1:
				for (int i = 0; i < n; i++) {
					ts[i] = new Sunita();
					ts[i].create();
				}
				b = true;
				break;
			case 2:
				if (b) {
					System.out.println("**** Data Entered as below ****");
					for (int i = 0; i < n; i++) {
						ts[i].display();
					}
				} else {
					System.out.println("No Recors..!!");
				}
				break;
			case 3:
				if (b) {
					for (int j = 0; j < n; j++) {
						ts[j].raiseSalary();
					}
				} else {
					System.out.println("No Recors..!!");
				}
				break;
			case 4:
					System.out.println("Exiting.......");
					System.exit(c);
			default:
				System.out.println("Please make a correct choice......");
				break;
			}
		} while (c !=4);
	}


}
