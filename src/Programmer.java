public class Programmer extends Person{
    public Programmer(String name, int age) {
        super(name, age);
    }

    public Programmer() {
    }

    @Override
    public void walk(){
        System.out.println(getName() + " is walking");
    }
}
