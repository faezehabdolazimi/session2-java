class Circle {  
    private double radius;  

    
    public Circle(double radius) {  
        this.radius = radius;  
    }  


    public double area() {  
        return Math.PI * radius * radius;  
    }  

    public double perimeter() {  
        return 2 * Math.PI * radius;  
    }  
}  


class Square {  
    private double side;  

    
    public Square(double side) {  
        this.side = side;  
    }  

    public double area() {  
        return side * side;  
    }   
    public double perimeter() {  
        return 4 * side;  
    }  
}   
class Rectangle {  
    private double length;  
    private double width;  
    public Rectangle(double length, double width) {  
        this.length = length;  
        this.width = width;  
    }  
    public double area() {  
        return length * width;  
    }  

    // متد برای محاسبه محیط  
    public double perimeter() {  
        return 2 * (length + width);  
    }  
}  


