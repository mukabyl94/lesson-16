public class Singer extends Person{
    public Singer(String name, int age) {
        super(name, age);
    }

    public Singer() {
    }

    @Override
    public void walk(){
        System.out.println(getName() + " is walking");
    }
}
