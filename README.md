# iprimed In this case I have uploaded 2 files.

CODE: First I created a class the name of the class is class Employee{}

Firstly I have to get the employee details from the user so that i used SCANNER class Scanner s = new Scanner(System.in);

Then I used while loop for continuous iteration if we don't know the number of iterations then we are using while loop. In that while loop i took the boolean value to check whether the condition is true or not.

while(true)
		{}
		
In that while loop i have printing statements for 1.Create 2.Display 3.Raise salary 4 .Exit. 

After in this case I wrote switch statement to check for each value.

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
			
In cases i have mentioned some methods that methods i wrote before the main() method only.

read() method is for reading the inputs from user like name,age,salary

display() method will took these inputs and display in console.

raiseSalary() method is used bcause I want to raise the salary so I am using + operator to add more salary.

Output:

In output it will display 1.create 2.display 3.Raise salary 4.Exit Enter your choice

It you write number 1 then it will displays 1.name 2.age 3.salary again it displays Enter your choice:

And after clicking on number say 2 all the details of employee will be displayed on console. Again Enter your choice is displayed

After if you click number say 3 it add the salary and again it will display all the employee details because I called the display method in raiseSalary() method

And if you click on 4 number it will be Exit from the console.
