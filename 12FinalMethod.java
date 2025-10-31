class Parent{
    final void display(){
        System.out.println("Final method: cannot be overridden");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("child method");
    }
}
class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
        
    }
}
