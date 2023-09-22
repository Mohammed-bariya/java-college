class Superclass {
    int superClassValue;

   
    Superclass(int value) {
        superClassValue = value;
        System.out.println("Superclass constructor invoked.");
    }
}

class Subclass extends Superclass {
    int subclassValue;

    
    Subclass(int superValue, int subValue) {
        super(superValue);
        subclassValue = subValue;
        System.out.println("Subclass constructor invoked.");
    }

    void display() {
        System.out.println("Superclass value: " + superClassValue);
        System.out.println("Subclass value: " + subclassValue);
    }
}

public class ex6 {
    public static void main(String[] args) {
        Subclass subObj = new Subclass(10, 20);
        subObj.display();
    }
}
