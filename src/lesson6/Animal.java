package lesson6;

abstract class Animal {
    public int length;

    abstract void run(int length);

    abstract void swim(int length);

    void printRunDistance(Object obj, int distance) {
        System.out.println(obj.getClass().getName() + " пробежал: " + distance + " м.");
    }

    void printSwimDistance(Object obj, int distance) {
        System.out.println(obj.getClass().getName() + " проплыл: " + distance + " м.");
    }
}
