package hu.progmatic;

public class Car {
    private String type;
    private int age;
    private Owner owner;

    public Car() {
    }

    public Car(String type, int age, Owner owner) {
        this.type = type;
        this.age = age;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
