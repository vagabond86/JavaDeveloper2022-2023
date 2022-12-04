package creatures;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    Boolean property;

    public Human(String firstName) {
        super("homo sapiens", 50.0);
        this.firstName = firstName;
    }

    void car() {
        if (property) {
            System.out.println("Ten samochód jest własnością " + firstName);
        } else {
            System.out.println("Ten samochód nie należy do " + firstName);
        }
    }
}
