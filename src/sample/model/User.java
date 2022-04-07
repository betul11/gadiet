package sample.model;

public class User {
    private int age;
    private int weight;
    private boolean isPregnant;
    private boolean isVegetarian;

    public User(int age, int weight, boolean isPregnant, boolean isVegetarian) {
        this.age = age;
        this.weight = weight;
        this.isPregnant = isPregnant;
        this.isVegetarian = isVegetarian;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
