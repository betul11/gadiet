package sample.model;

public class User {
    private int age;
    private int gender; // 1 for female and 2 for male
    private int weight;
   private boolean isPregnant;

    public User(int age, int gender, int weight, boolean isPregnant) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.isPregnant = isPregnant;

    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public User(){

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

}
