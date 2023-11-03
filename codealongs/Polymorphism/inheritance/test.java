package codealongs.Polymorphism.inheritance;

public class test {
    
    public static void main(String[] args) {
        Animal a = new Animal(12, 55.4, 70.5);
        System.out.println(a.weight);

        Walrus w = new Walrus(20, 300.5, 60.7);
        Parrot p = new Parrot(5, 3, 20, "Felix");
        System.out.println(w.age);
        p.fly(5);
        walrusChecker(a);
        walrusChecker(w);
        walrusChecker(p);


    }

    public static void walrusChecker (Animal a){
        if (a instanceof Walrus) {
            System.out.println("This animal is a Walrus");
        }
        else {System.out.println("This animal is not a walrus, it is a " + a.getClass().getSimpleName());}
    }
}
