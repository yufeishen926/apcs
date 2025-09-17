package rectangle;

public class rectangle {
   private double X;
   private double Y;
   private double width;
   private double height; 

   public rectangle(double Xin, double Yin, double widthin, double heightin) {
      X = Xin;
      Y = Yin;
      width = widthin;
      height = heightin;
   }

   public void calcArea() {
      System.out.println ("Area: " + width * height);
   }

   public void calcPerimeter() {
      System.out.println ("Perimeter: " + (width * 2 + height * 2));
   }
   
}
