class animal {
    void eat() {
        System.out.println("This animal eats food");
    }   
}

class Dog extends animal {
    void bark() {
        System.out.println("This dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("This dog is weeping");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   
        p.weep();  
        p.bark();  
    }
}