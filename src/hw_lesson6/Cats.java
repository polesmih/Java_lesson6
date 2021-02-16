package hw_lesson6;

class Cats extends Animals {

    public Cats(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        int distance = length;
        if (length <= 200) {
            printRunDistance(getName(), distance);
        } else {
            System.out.println("Кошкa столько не пробежит");
        }
    }

    @Override
    void swim(int length) {
        int distance = length;
        if (length <= 0) {
            printSwimDistance(getName(), distance);
        } else {
            System.out.println("Кошки не умеют плавать");
        }
    }
}
