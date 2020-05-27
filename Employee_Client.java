import java.util.Scanner;
public class Employee_Client {

    public static void main(String[] args) {
    	

        Scanner input = new Scanner(System.in);
        String last, first, dept;
        double pay_rate;
        int hours;        
        
        Employee prof = new Employee("Doe", "John",  25.50, 50, "COSC"); //subclass alternate constructor invoked
        Employee newEmp = new Employee(); //subclass default constructor invoked
        
        
        System.out.println("Enter employee last name: ");
		last = input.next(); 

    	System.out.println("Enter employee first name: ");
		first = input.next(); 

    	System.out.println("Enter department: ");
		dept = input.next(); 

    	System.out.println("Enter employee pay rate: ");
		pay_rate = input.nextDouble(); 

    	System.out.println("Enter hours worked: ");
		hours = input.nextInt();
       
		
		System.out.println("-- Record for both employees with overridden .toString from subclass ---");
		System.out.println(prof);
		newEmp.setAll(last, first, hours, pay_rate, dept);
		System.out.println(newEmp);

		System.out.println("-- Output with calls to overidden method print from subclass ---");
		prof.print();
		newEmp.print();

		System.out.println("--- Output with calls to getters from the superclass ---");
		 String output = "The wages for " + newEmp.getFirstName() + ", " + newEmp.getLastName() + " from the " + newEmp.getDepartment()
		 + " department are $" + newEmp.getPayRate() * newEmp.getHoursWorked();
	     System.out.println(output);

	        System.out.println("--- Call to overridden equals/subclass for 2 Employee objects---");
	        if (!newEmp.equals(prof)) {
	            System.out.println("Couldn't find an employee with same record.");
	        } else {
	            System.out.println("They are not equal!");
	        }
	    }

		
    }	
 

    

