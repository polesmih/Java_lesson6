package lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(), new Cat()
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
            animals[i].swim(5);
        }
    }
}

