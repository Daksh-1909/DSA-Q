
class Animal {
    public void eat() {
        System.out.println("This animal eat food");
    }
    public void sleep() {
        System.out.println("This animal sleeps");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("This dog eats dog food");
    }
    public void sleep() {
        System.out.println("This dog sleeps in a dog house");
    }
}

public class RuntimePoly {
    
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.eat(); 
        a1.sleep(); 
    }
}


// 8th prg