import java.util.*;

public class Simple_Interest{
  public static void main(String[] args){
 Scanner scn=new Scanner(System.in);

 System.out.println("Enter the principle");
  double p=scn.nextDouble();

  System.out.println("Enter the rate");
  double r=scn.nextDouble();

 System.out.println("Enter the time");
  double t= scn.nextDouble();

  double si=(p*r*t)/100;
  System.out.println("Simple Interst is: " + si);
  
}
}