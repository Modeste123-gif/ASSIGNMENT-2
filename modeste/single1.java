class Tester {
   public static void main(String[] arguments) {
      Rectangle rect = new Rectangle();
      rect.display();
      rect.area();
   }
}
class Shape {
   void display() {
      System.out.println("Inside display");
   }
}
class Rectangle extends Shape {
   void area() {
      System.out.println("Inside area");
   }
}
