public class Dancer extends Person{
    public Dancer(String name, int age) {
        super(name, age);
    }

    public Dancer() {
    }

    @Override
    public void walk(){
        System.out.println(getName() + " is walking");
    }
}
