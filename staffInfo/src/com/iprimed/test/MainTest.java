package com.iprimed.test;

import java.util.Scanner;

import com.iprimed.dto.StaffInfoEntity;
import com.iprimed.service.StaffService;
import com.iprimed.service.StaffServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		// StaffInfoEntity staff = new StaffInfoEntity();
		StaffService service = new StaffServiceImpl();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int display = 0;
		try {
			do {
				System.out.println("1.Insert Staff Details");
				System.out.println("2.Display Staff Details");
				System.out.println("3.Update Staff Details");
				System.out.println("4.Delete Staff Details");
				System.out.println("Enter your choice");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					StaffInfoEntity entity = new StaffInfoEntity();
					System.out.println("Enter ID of Staff :");
					entity.setSid(sc.nextInt());
					System.out.println("Enter Name of Staff :");
					entity.setName(sc.next());
					System.out.println("Enter Email of Staff :");
					entity.setEmail(sc.next());
					System.out.println("Enter Salary of Staff :");
					entity.setSalary(sc.nextDouble());
					System.out.println("Enter Age of Staff :");
					entity.setAge(sc.nextInt());
					System.out.println("Enter Gender of Staff :");
					entity.setGender(sc.next());
					System.out.println("Enter Address of Staff :");
					entity.setAddress(sc.next());
					System.out.println("Enter Department of Staff :");
					entity.setDepartment(sc.next());
					System.out.println("Enter Subject handled by Staff :");
					entity.setSubjectTaken(sc.next());
					service.insertDetails(entity);
					break;
				case 2:
					do {
						System.out.println("1.Display all the staff details");
						System.out.println("2.Display perticualr staff by ID");
						System.out.println("3.Display perticualr staff by Name");
						System.out.println("4.Display perticualr staff by Email");
						System.out.println("5.Exiting.......");
						System.out.println("Enter your choice :");
						display = sc.nextInt();
						switch (display) {
						case 1:
							System.out.println("Details of Staff are :");
							service.displayAllDetails();
							break;
						case 2:
							System.out.println("Enter the ID of Staff you want to display");
							int id = sc.nextInt();
							service.getById(id);
							break;
						case 3:
							System.out.println("Enter the Name of Staff you want to display");
							String name = sc.next();
							service.getByName(name);
							break;
						case 4:
							System.out.println("Enter the Email of Staff you want to display");
							String em = sc.next();
							service.getByEmail(em);
							break;
						case 5:
							System.out.println("Exiting.............");
							break;
						default:
							System.out.println("Please Enter the correct choice!!!!");
							break;
						}
					} while (display != 5);
					break;
				case 3:
					StaffInfoEntity staff = new StaffInfoEntity();
					int update = 0;
					do {
						System.out.println("1.Update subject taken and salary of staff");
						System.out.println("2.Update age and address of staff");
						System.out.println("3.Exiting.........");
						System.out.println("Enter your choice :");
						update = sc.nextInt();
						switch (update) {
						case 1:
							System.out.println("Enter the Staff ID you want to update");
							staff.setSid(sc.nextInt());
							System.out.println("Enter salary you want to update");
							staff.setSalary(sc.nextDouble());
							System.out.println("Enter the subject taken want to update");
							staff.setSubjectTaken(sc.next());
							service.updateDetails(staff);
							break;
						case 2:
							System.out.println("Enter the Staff ID you want to update");
							staff.setSid(sc.nextInt());
							System.out.println("Enter Address you want to update");
							staff.setAddress(sc.next());
							System.out.println("Enter the age taken want to update");
							staff.setAge(sc.nextInt());
							service.updateAddressAndDept(staff);
							break;
						case 3:
							System.out.println("Exiting...........");
							break;
						default:
							System.out.println("Please enter the correct choice");
							break;
						}
					} while (update != 3);
					break;
				case 4:
					int delete = 0;
					do {
						System.out.println("1.Delete Staff record by ID");
						System.out.println("2.Delete Staff record by Name");
						System.out.println("3.Exiting........");
						System.out.println("Enter your choice :");
						delete = sc.nextInt();
						switch (delete) {
						case 1:
							System.out.println("Enter the Id of staff you want to delete");
							int id = sc.nextInt();
							service.deleteStaffById(id);
							break;
						case 2:
							System.out.println("Enter the Name of staff you want to delete");
							String nm = sc.next();
							service.deleteStaffByName(nm);
							break;
						case 3:
							System.out.println("Exiting.......");
						default:
							System.out.println("Please enter the correct choice!!!!");
							break;
						}
					} while (delete != 3);
					break;
				case 5:
					System.out.println("Exit");
				default:
					System.out.println("Please enter the correct choice!!!!");
					break;
				}
			} while (ch != 5);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
