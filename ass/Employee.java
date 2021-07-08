public class Employee implements Comparable {

 public String name;

 

 public int compareTo(Object o) {

  return 0;

 }

 

 public static void main(String args[]) {

  Employee employeeOne = new Employee();

  Employee employeeTwo = new Employee();

  employeeOne.name = "John";

  employeeTwo.name = "Martin";

  TreeSet employeeSet = new TreeSet();

  employeeSet.add(employeeOne);

  employeeSet.add(employeeTwo);

  Iterator empIt = employeeSet.iterator();

  while (empIt.hasNext()) {

   System.out.println(empIt.next().name);

  }

 }

}