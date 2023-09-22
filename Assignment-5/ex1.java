class MyClass {
    private int myInt;
    private String myString;

    public void setValues(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    public void printValues() {
        System.out.println("myInt: " + this.myInt);
        System.out.println("myString: " + this.myString);
    }
}

public class ex1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.setValues(10, "Hello World");
        obj.printValues();
    }
}
