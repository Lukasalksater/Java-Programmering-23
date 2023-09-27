package MethodsTraining;

import java.util.Scanner;

public class GeometryTester {


public static void main(String[] args){

    

    Scanner scanner = new Scanner (System.in);
    System.out.println("What is the width of the rectangle?");
    double rectangleWidth = scanner.nextDouble();
    System.out.println("What is the lenght of the rectangle");
    double rectangleLenght = scanner.nextDouble();

    printOutRectangleAreaAndPerimeter(rectangleWidth, rectangleLenght);

    System.out.println("What is the circle radius?");
    double circleRadius = scanner.nextDouble();
    scanner.close();
    printOutCircleAreaAndPerimeter(circleRadius);

}

public static void printOutRectangleAreaAndPerimeter(double rectangleWidth, double rectangleLenght){
   

    Rectangle rectangle = new Rectangle (rectangleWidth, rectangleLenght);
    System.out.println(rectangle.CalculateArea() + " cm2 is the area");
    System.out.println(rectangle.CalculatePerimeter() + " cm is the perimeter");
}

public static void printOutCircleAreaAndPerimeter(double circleRadius){

    Circle circle = new Circle (circleRadius);
    System.out.println(circle.CalculateArea() + " cm2 is the area");
    System.out.println(circle.CalculatePerimeter() + " cm is the perimeter");
}


}