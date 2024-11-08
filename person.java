package ir.isc.training;
	abstract class Person {  
	    protected String name;  
	    public Person(String name) {  
	        this.name = name;  
	    }   
	    public abstract void notify(String message);  
 
	    public String getName() {  
	        return name;  
	    }  
	}  
	class Student extends Person {  
	    public Student(String name) {  
	        super(name);  
	    }  
	    @Override  
	    public void notify(String message) {  
	        System.out.println("message for " + name + ": " + message);  
	    }  
	}  
	class Teacher extends Person {  
	    public Teacher(String name) {  
	        super(name);  
	    }  
	    @Override  
	    public void notify(String message) {  
	        System.out.println("A message for the teacher " + name + ": " + message);  
	    }  
	}  
