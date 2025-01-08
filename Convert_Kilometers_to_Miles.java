import java.util.*;

public class Convert_Kilometers_to_Miles{
    public static void main(String[] args){
   Scanner scn=new Scanner(System.in);
   

  System.out.println("Enter the Kilometer");
  double a=scn.nextDouble();

  double miles= a* 0.621371;
  System.out.println("Converted Kilometer in miles is:" + miles);
}

}