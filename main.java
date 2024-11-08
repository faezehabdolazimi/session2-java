package ir.isc.training;

public class main {
	
	    public static void main(String[] args) {  
	        Person student = new Student("Ali");  
	        Person teacher = new Teacher("Mr.mohamadi");  

	        student.notify("Welcome to the class!");  
	        teacher.notify("Please check the assignments.");  

        Circle circle = new Circle(5);  
        Square square = new Square(4);  
        Rectangle rectangle = new Rectangle(6, 3); 
        System.out.println("Circle with radius 5:");  
        System.out.printf("مساحت: %.2f\n", circle.area());  
        System.out.printf("محیط: %.2f\n", circle.perimeter());  

        System.out.println("\nA square with 4 sides:");  
        System.out.printf("مساحت: %.2f\n", square.area());  
        System.out.printf("محیط: %.2f\n", square.perimeter());  

        System.out.println("\nA rectangle with a length of 6 and a width of 3:");  
        System.out.printf("مساحت: %.2f\n", rectangle.area());  
        System.out.printf("محیط: %.2f\n", rectangle.perimeter());  
    }  
}  
	
