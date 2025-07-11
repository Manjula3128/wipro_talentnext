package Oops;
class Apple extends Fruit {
    public Apple(int size) {
        super("Apple", "sweet", size);
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste + ".");
    }
}