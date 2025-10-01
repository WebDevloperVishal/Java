class animal {
    void eat()
    {
        System.out.println("This animal eats food");
    }   
}

class Dog extends animal{
    void bark()
    {
        System.out.println("This dog barks");
    }
}

class SingleInhertance{

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); 
        d.bark(); 
    }
}