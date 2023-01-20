public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Programmer("Mukabyl", 28),
                new Dancer("Nurbek", 30),
                new Singer("Aida", 25)};
        for(Person a : persons){
           a.walk();
        }
    }
}