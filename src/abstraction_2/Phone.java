package abstraction_2;

public class Phone implements Device{

    @Override
    public void type(){
        System.out.println("Typing on screen");

    }

    @Override
    public void listing() {
        System.out.println("Phone audio");

    }

    @Override
    public void speak(){
        System.out.println("Speaking with Phone mic");



    }

    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.listing();
        p1.speak();
        p1.type();
    }
}
