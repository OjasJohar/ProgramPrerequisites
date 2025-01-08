import java.util.*;

public class Area_of_a_Circle{
public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
     
    System.out.println("Enter the radius ");
    Double rad=scn.nextDouble();
   
    Double area= 3.14 * rad * rad;
    
    System.out.println("Area of circle is: " + area);
}
}