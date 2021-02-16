package lesson6;

class Dog extends Animal {

    @Override
    void run(int length) {
        int distance = length;
        if (length <= 500) {
            printRunDistance(this, distance);
        } else {
            System.out.println("Собака столько не пробежит");
        }
    }

    @Override
    void swim(int length) {
        int distance = length;
        if (length <= 10) {
            printSwimDistance(this, distance);
        } else {
            System.out.println("Собака столько не проплывет");
        }
    }
}