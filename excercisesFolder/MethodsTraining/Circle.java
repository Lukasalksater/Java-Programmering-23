package MethodsTraining;

public class Circle {
    
    double radius;

    public  Circle(double radius){

        this.radius = radius;

    }

    public double CalculateArea(){
        
        double area = radius * radius * Math.PI;
        return area;
        
    }

    public double CalculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
