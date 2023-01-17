package abstraction1;

public class Dog extends Animal{
    public static void main(String[] args) {
       Dog d1=new Dog();
       d1.name="Scoby";
       d1.fly();
       d1.walk();
    }

    @Override
    void fly() {
        System.out.println(name+ " can't fly ");
    }

}
