import java.util.*;

public class Power_Calculation{

 public static int power(int base, int exp){
     if(exp==0)
       return 1;
     
     return base* power(base,exp-1);
}

    public static void main(String[] args){
   Scanner scn=new Scanner(System.in);
 
   
  System.out.println("Enter the base");
  int base=scn.nextInt();

  
  System.out.println("Enter the exponential");
  int exp=scn.nextInt();

  int ans=power(base,exp);
System.out.println("Ans is : "+ ans);


}}