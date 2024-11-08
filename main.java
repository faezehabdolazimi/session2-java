package ir.isc.training;

public class main {
	
	    public static void main(String[] args) {  
	        Person student = new Student("Ali");  
	        Person teacher = new Teacher("Mr.mohamadi");  

	        student.notify("Welcome to the class!");  
	        teacher.notify("Please check the assignments.");  
	    }  
	}
