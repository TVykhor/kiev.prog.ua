/**
 * Created by TVykhor on 27.03.2017.
 */
public class Circle {
   private int radius;

   public Circle(){
       radius = 1;
   }

   public Circle(int radius){
       this.radius = radius;
   }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double calculateSquare(){
        //return 3.14 * radius * radius;
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String [] args){
        Circle c = new Circle();
        System.out.println(c.calculateSquare());
        c.setRadius(2);
        System.out.println(c.calculateSquare());
        Circle c2 = new Circle(5);
        System.out.println(c2.calculateSquare());
    }
}
