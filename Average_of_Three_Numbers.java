import java.util.*;

public class Average_of_Three_Numbers{
   public static void main(String[] args){
   Scanner scn=new Scanner(System.in);

  System.out.println("Enter the first number");
int a=scn.nextInt();

  System.out.println("Enter the second number");
int b=scn.nextInt();

  System.out.println("Enter the third number");
int c=scn.nextInt();

 double average=(double)(a+b+c)/3;
 System.out.println("Average of three numbers is: "+average);
}
}