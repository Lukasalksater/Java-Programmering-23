package ClassesTraining;

public class Executor {


    public static void main(String[] args) {
       Classes container = new Classes(); 
        Dog luna = new Dog(5, 10.5,"Luna");
        Dog john = container.link;
     

        container.link.age = 2;
        container.zelda.age = 50;
        System.out.println(container.link.age);
        System.out.println(container.zelda.age);
        System.out.println(luna.age);
        System.out.println(john.age);
        System.out.println(container.link);
        System.out.println(container.zelda);
        System.out.println(luna);
        System.out.println(john);

    }
    
}
