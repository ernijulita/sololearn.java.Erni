package more.on.classes;

public class inheritance {
    class Animal {

        public void makeSound() {
            System.out.println("Hi");
        }
    }
    class Dog extends Animal {
    }
    class A {
        public static void main(String args[ ]) {
            Dog dog = new Dog();
            dog.makeSound();
        }
    }
}
