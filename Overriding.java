class Animal{
    public void eat() {
        System.out.println("This animal eats food");
    }
    public void sleep() {
        System.out.println("This animal sleeps");
    }

}
class Dog extends Animal{
    public void eat() {
        System.out.println("This dog eats dog food");
    }
    public void sleep() {
        System.out.println("This dog sleeps in a kennel");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        
        a1.eat();
        a1.sleep();
        
        d1.eat();
        d1.sleep();
    }
}

// 4th prg
