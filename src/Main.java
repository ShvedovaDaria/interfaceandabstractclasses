interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

interface Animal {
    void makeSound();
    void eat();
}

abstract class Pet implements Animal {
    protected String foodType;

    public Pet(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void eat() {
        System.out.println("Eating " + foodType);
    }
}

class Dog extends Pet {
    public Dog() {
        super("Dog Food");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

class Cat extends Pet {
    public Cat() {
        super("Cat Food");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

class Bird implements Animal {
    private String foodType;

    public Bird(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet! Tweet!");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + foodType);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3, 8);
        System.out.println("Triangle Area: " + triangle.calculateArea());

        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();

        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();

        Bird bird = new Bird("Seeds");
        bird.makeSound();
        bird.eat();
    }
}
