class Person{
    public void Method_A() {
        System.out.println("This is method A of class Person");
    }
}
class Employee extends Person{
    public void Method_B() {
        System.out.println("This is method B of class Employee");
    }
}
class Manager extends Employee{
    public void Method_C1() {
        System.out.println("This is method C1 of class Manager");
    }
    public void Method_C2() {
        System.out.println("This is method C2 of class Manager");
    }
}
public class MultiLevelInh {
    
    public static void main(String[] args) {
        Manager m = new Manager();
        m.Method_A();
        m.Method_B();
        m.Method_C1();
        m.Method_C2();
    }
}
    
// 9th prg