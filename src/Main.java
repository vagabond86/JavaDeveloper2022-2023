import creatures.Animal;
import devices.Car;

public class Main {
    public static void main(String[] args) {

//        devices.Phone nokia = new devices.Phone();
//        nokia.id = 1;
//        nokia.producer = "Nokia";
//        nokia.model = "3210i";
//        nokia.isAndroid = false;
//        nokia.screenSize = 3.2;
//        devices.Phone iphone = new devices.Phone();
//        iphone.id = 2;
//        iphone.producer = "Apple";
//        iphone.model = "13";
//        iphone.isAndroid = false;
//        iphone.screenSize = 6.2;
//
//        System.out.println("Moje telefony");
//        System.out.println("Producent: " + nokia.producer);
//        System.out.println("Model: " + nokia.model);
//        System.out.println("Producent: " + iphone.producer);
//        System.out.println("Model: " + iphone.model);


        Animal dog = new Animal("canis");
        dog.name = "Saba";

        System.out.println("Moje zwierzęta:");
        System.out.println("Imię: " + dog.name);

        Animal cat = new Animal("felis", -10.0);
        cat.name = "Mruczek";

        System.out.println(cat.weigt);


//        iphone.turnOn();

//        dog.takeForAWalk();
//        System.out.println(dog.weight);
//        dog.takeForAWalk();
//        System.out.println(dog.weight);
//        dog.takeForAWalk();
//        System.out.println(dog.weight);
//        dog.takeForAWalk();
//        System.out.println(dog.weight);
//        dog.takeForAWalk();
//        System.out.println(dog.weight);
//
//        dog.feed();

//        devices.Car Lambo = new devices.Car();
//        Lambo.model = "Huracan";
//        Lambo.producer = "Lamborghini";
//        Lambo.color = "black";
//        Lambo.KamilsProperty = false;
//
//        creatures.Human Kamil = new creatures.Human();
//        Kamil.firstName = "Kamil";
//        Kamil.lastName = "Górzyński";
//        Kamil.property = false;
//
//
//        System.out.println("W moim garażu znajdziesz: " + Lambo.producer + " w kolorze: " + Lambo.color);

        Car fiat = new Car(1,"fiat","bravo","diesel");
        fiat.millage = 323453.0;

        System.out.println(fiat);

    }
}
