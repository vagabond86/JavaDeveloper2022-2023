package creatures;

public class Animal {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_HORSE_WEIGHT = 800.0;


    public double weigt;

    public final String species;

    public String name;
    private Double weight;
    private Boolean isAlive;

    public Double getWeight() {
        return this.weigt;
    }

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, Double weight) {
        this.isAlive = true;
        this.species = species;
        if ((weight <= 0)) {
            System.out.println("Waga jest błędna. Przypisano wartość domyślną");
            this.weight = DEFAULT_ANIMAL_WEIGHT.doubleValue();
        } else {
            this.weight = weight;
        }
    }

    void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne, że żyje!");
        } else {
            System.out.println("no niestety, już trochę za późno...");
        }
    }

    void feed(Double foodWeight) {
        if (!isAlive) {
            weight += (foodWeight * 0.3);
        }
    }

    void takeForAWalk() {
        if (isAlive == false) {
            System.out.println("Dzwonię na policję");
        } else {
            weight -= 0.5;
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("dzięki za spacer, teraz idę na drzemkę");
            }
        }
    }
}