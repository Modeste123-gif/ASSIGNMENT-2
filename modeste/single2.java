class main
{
public static void main(String[] args) {
        B objB = new B();
        objB.display(); // Reusing the method of A named display
        objB.print();    
    }
} 
class A {
    void display() {
        System.out.println("I am a method from class A");
    }
}


class B extends A {
 void print() {
        System.out.println("I am a method from class B");
    }}

    