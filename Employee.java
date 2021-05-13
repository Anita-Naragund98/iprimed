import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		int choice;
		String name = null;
		int age = 0;
		double salary = 0;
  		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.RaiseSalary");
		System.out.println("4.Exit");
		System.out.println("Enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter salary");
				salary = sc.nextInt();
			case 2:

				System.out.println("Enter choice");
				choice = sc.nextInt();

				System.out.println("Employee details are " + name + "," + age + "," + salary);
			case 3:

				System.out.println("Enter choice");
				choice = sc.nextInt();

				salary = salary + 5000;
				System.out.println("Salary is Raised........");
				System.out.println("Employee details are " + name + "," + age + "," + salary);
			case 4:
				System.out.println("Enter choice");
				choice = sc.nextInt();
				System.exit(choice);
			default:
				System.out.println("Please make a correct choice......");
				break;
			}
		}
}
