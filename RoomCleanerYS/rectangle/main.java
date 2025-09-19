package rectangle;
public class main {
   public static void main(String [] args)
   {
      rectangle rect1 = new rectangle(0,10,50,12);

      rect1.calcArea();
      rect1.per();

      rectangle rect2 = new rectangle(0, 10, 20, 5);
      rect2.calcArea();
      System.out.println("perimeter: " + rect2.perimeter());

   }
   
}
