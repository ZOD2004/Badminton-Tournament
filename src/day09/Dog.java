package day09;

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The Dog barks: Woof! Woof!");
    }

    void wagTail() {
        System.out.println("The tail is wagging.");
    }
}
