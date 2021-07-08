package com.xworkz.dead_lock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		try {
			File f = new File("split.txt");
			Scanner sc = new Scanner(f);

			List<Person> people = new ArrayList<Person>();

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] details = line.split(":");
				String gender = details[0];
				String name = details[1];
				int age = Integer.parseInt(details[2]);
				Person p = new Person(gender, name, age);
				people.add(p);
			}

			for (Person p : people) {
				System.out.println(p.toString());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Person {

	private String gender;
	private String name;
	private int age;

	public Person(String gender, String name, int age) {
		this.gender = gender;
		this.setName(name);
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return this.gender + " " + this.name + " " + this.age;
	}

}
