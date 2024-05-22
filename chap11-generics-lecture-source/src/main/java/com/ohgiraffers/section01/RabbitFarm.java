package main.java.com.ohgiraffers.section01;

public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
