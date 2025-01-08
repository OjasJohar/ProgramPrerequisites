import java.util.*;

public class Celsius_To_Fahrenheit_Conversion{
public static void main(String[] args){
  Scanner scn=new Scanner(System.in);
  
  System.out.println("Enter the tempersture in Celsius");
  double cel=scn.nextDouble();

  Double fer=((cel*9)/5)+32;
  System.out.println("Temperature in fahrenheit is: " + fer); 
}
}