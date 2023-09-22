public class ex3 {
    int id;
    String name;
    int age;

    
    ex3() {
        id = 0;
        name = "";
        age = 0;
    }


    ex3(int i, String n) {
        id = i;
        name = n;
        age = 0;
    }

   
    ex3(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        ex3 oc1 = new ex3();
        ex3 oc2 = new ex3(1, "John");
        ex3 oc3 = new ex3(2, "Jane", 25);

        System.out.println("Object 1: ID=" + oc1.id + ", Name=" + oc1.name + ", Age=" + oc1.age);
        System.out.println("Object 2: ID=" + oc2.id + ", Name=" + oc2.name + ", Age=" + oc2.age);
        System.out.println("Object 3: ID=" + oc3.id + ", Name=" + oc3.name + ", Age=" + oc3.age);
    }
}
