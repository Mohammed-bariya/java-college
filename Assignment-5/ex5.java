
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}


class Bulldog extends Dog {
    void display() {
        System.out.println("This is a bulldog.");
    }
}

public class ex5 {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog();

      
        bulldog.eat();   
        bulldog.bark();  
        bulldog.display(); 
    }
}
