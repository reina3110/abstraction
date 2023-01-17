package abstraction1;

public abstract class Animal {
    String name;

    void walk(){// normal method
        System.out.println(name+ " can walk");
    }
    abstract void fly();//abstract method
}
