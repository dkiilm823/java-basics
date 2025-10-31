class Animal{
    void type(){
        System.out.println("Can be herbivore, carnivore or omnivore");
    }
}
class Dog extends Animal{
    void type(){
        System.out.println("It is an omnivore animal");
    }
}

class Cow extends Animal{
    void type(){
        System.out.println("It is an herbivore animal");
    }
}


class MethodOverriding {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.type();
        Cow obj2 = new Cow();
        obj2.type();
    }
}
