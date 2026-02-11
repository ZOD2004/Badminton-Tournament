package day09;

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat purrs");
    }

    void cuddle() {
        System.out.println("The cat is cuddling.");
    }
    @Override
    void eat(){
        System.out.println("Cat eating Fish");
    }
}
