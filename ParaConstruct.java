public class ParaConstruct {
    public String name;
    public int age;
    
    public ParaConstruct(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public ParaConstruct() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called");
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ParaConstruct person1 = new ParaConstruct("Alice", 30);
        person1.displayInfo();
        ParaConstruct person2 = new ParaConstruct();
        person2.displayInfo();
    }
}


// 2nd prg