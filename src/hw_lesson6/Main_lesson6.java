package hw_lesson6;

public class Main_lesson6 {
    public static void main(String[] args) {

        Dogs dog = new Dogs("Собака Бобик");
        Cats cat = new Cats("Кот Мурзик");

        dog.run(200);
        cat.run(100);

        dog.swim(3);
        cat.swim(50);
    }
}
