import java.util.*;

public class Volume_of_a_Cylinder{
  public static void main(String[] args){
   Scanner scn=new Scanner(System.in);

   System.out.println("Enter the radius of Cylinder");
   double radius=scn.nextDouble();

   System.out.println("Enter the height of Cylinder");
   double height=scn.nextDouble();

  double volume=3.14 * radius * radius * height;
  System.out.println("Volume of Cylinder is : " + volume);
   
 }
}