package lesson6;

class Cat extends Animal {

    @Override
    void run(int length) {
        int distance = length;
        if (length <= 200) {
            printRunDistance(this, distance);
        } else {
            System.out.println("Кошкa столько не пробежит");
        }
    }

    @Override
    void swim(int length) {
        int distance = length;
        if (length <= 0) {
            printSwimDistance(this, distance);
        } else {
            System.out.println("Кошки не умеют плавать");
        }
    }
}

