
interface Parent1 {
    void method1();
}


interface Parent2 {
    void method2();
}


class Child implements Parent1, Parent2 {
    public void method1() {
        System.out.println("This is method1 from Parent1");
    }

    public void method2() {
        System.out.println("This is method2 from Parent2");
    }

    void method3() {
        System.out.println("This is method3 from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Child childObj = new Child();

        
        childObj.method1();
        childObj.method2();

        
        childObj.method3();
    }
}
