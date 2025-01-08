import java.util.*;

public class Perimeter_of_a_Rectangle{
  public static void main(String[] args){
   Scanner scn=new Scanner(System.in);

   System.out.println("Enter the length");
  double length=scn.nextDouble();

  System.out.println("Enter the width");
  double width=scn.nextDouble();

  Double peri= 2*(length+width);
System.out.println("Perimeter of a rectangle is: "+peri);
}
}