import java.util.*;

class Add_Two_Numbers{
  public static void main(String[] args){
    Scanner scn =new Scanner(System.in);
    
    System.out.println("Enter first number");
    int a=scn.nextInt();

    System.out.println("Enter second number");
    int b=scn.nextInt();
   
    int c=a+b;
    System.out.println("Addition of two number is: "+ c);
}
}