package codealongs.Polymorphism.inheritance;

public class Parrot extends Animal {
    public Parrot(int age, double weight, double lenght, String name){
        super(age, weight, lenght);
        this.name = name;
    }

    public void fly(double time){
        System.out.println(name + " flaps its wings and flies for " + time + " seconds");
    }
    
}
