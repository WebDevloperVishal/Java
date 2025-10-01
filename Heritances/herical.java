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

class Cat extends animal {
    void meow() {
        System.out.println("This cat is doing meowwwww");
    }
}

public class herical {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        Cat m = new Cat();
        p.eat();   
        p.weep();  
        p.bark();  
        m.meow();
    }
}