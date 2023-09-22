package ClassesTraining;

public class Car {
    String make;
    String model;
    int year;
    String color;


    Car (String make, String model,int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    Car (){
        make = "Ferrari";
        model = "A2";
        year = 1977;
        color = "red";

    }

    Car (String make, String model, String color){
        this(make, model, 1977, color);
    }

    Car (int year){
        this("Ferrari", "A2", year, "red");
    }

    Car (String make){
        this(make,"A2", 1977, "red");
    }




}
