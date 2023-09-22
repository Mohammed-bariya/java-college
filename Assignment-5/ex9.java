
interface A {
    void methodA();
}

interface B {
    void methodB();
}


class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A is implemented.");
    }

    @Override
    public void methodB() {
        System.out.println("Method B is implemented.");
    }
}

public class ex9 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
