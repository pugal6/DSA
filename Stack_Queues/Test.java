public interface Test {
    int a = 10;
    void greet();
    

    default void walk() {
        System.out.println("walking");
    }
    static void swim() {
        System.out.println("swimming");
    }
}

class Sub implements Test {
    public void greet() {
        System.out.println("greet in sub class");
    }
    public void disp()  {
        System.out.println("value of var is: " + a);
    }
    public void summa() {
        System.out.println("summa oru method");
    }
}
class Demo {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.greet();
        obj.disp();
        obj.walk();
        Test.swim();



    }
}
