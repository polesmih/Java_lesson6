package hw_lesson6;

abstract class Animals {
    private String name;
    public int length;

    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
   }

    abstract void run(int length);

    abstract void swim(int length);

    void printRunDistance(String name, int distance) {
        System.out.println(name + " пробежал: " + distance + " м.");
    }

    void printSwimDistance(String name, int distance) {
        System.out.println(name + " проплыл: " + distance + " м.");
    }
}
