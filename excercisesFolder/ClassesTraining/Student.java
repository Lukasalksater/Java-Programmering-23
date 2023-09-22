package ClassesTraining;

public class Student {
    String name;
    int age;
    double grade;

    Student (String name, int age, double grade){

        this.name = name;
        this.age = age;
        this.grade = grade;

    }


    public static void main(String[] args) {
        Student student = new Student("John", 12, 5.5);
        System.out.println("the students name is " + student.name);
        System.out.println(student.age);
        System.out.println(student.grade);
    }
    
}
