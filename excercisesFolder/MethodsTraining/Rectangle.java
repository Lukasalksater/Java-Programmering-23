package MethodsTraining;

public class Rectangle {
    
    double lenght;
    double width;

    public  Rectangle(double width, double lenght){

        this.width = width;
        this.lenght = lenght;

    }

    public  double CalculateArea () {

        double area = lenght * width;
        return area;
    }

    public double  CalculatePerimeter(){
        double perimeter = lenght * 2 + width * 2;
        return perimeter;
    }
}
