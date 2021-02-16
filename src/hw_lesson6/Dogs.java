package hw_lesson6;

class Dogs extends Animals {

    public Dogs(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        int distance = length;
        if (length <= 500) {
            printRunDistance(getName(), distance);
        } else {
            System.out.println("Собака столько не пробежит");
        }
    }

    @Override
    void swim(int length) {
        int distance = length;
        if (length <= 10) {
            printSwimDistance(getName(), distance);
        } else {
            System.out.println("Собака столько не проплывет");
        }
    }
}
