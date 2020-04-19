/*
 * My first subrountine program
 * 
 * Rose Verma
 */
package subroutine;

import java.util.Scanner;

public class Subroutine {

   public static int findingAvg(int n1, int n2, int n3)
   {
   
    int sum = n1 + n2 + n3;
     int total= sum/3;
     System.out.println("The average is" + total);
     return(total);
    
    
   }
   
   public static int squared(int num1, int num2, int num3)
   {
       int total1 = num1 * num1;
       int total2= num2 * num2;
       int total3 = num3* num3;
       System.out.println("num1 square is: "+ total1+"num2 square is: " +total2+"num3 square is: " +total3);
       return(total1);
              }
       
       
   
   
       public static int adding(int num1, int num2, int num3)
       {
           int sum = num1+num2+num3;
           System.out.println("The sum is: "+sum);
           return(sum);
       }
    public static int multiply(int num1, int num2, int num3)
    {
        int total = num1*num2*num3;
        System.out.println("The product is: "+ total);
        return(total);
    }
       public static double  missingSideofATriangle(int num1, int num2)
       {
           int sideA=num1;
           int sideB=num2;
           System.out.println("The hypotenuse is; "+ Math.hypot(sideA,sideB));
           return(Math.hypot(sideA,sideB));
       }
       public static double  power (int num1, int num2)
       {        
           System.out.println(num1+" to the power to"+num2+" is "+Math.pow(num1,num2));
       return(Math.pow(num1,num2));
       }
       public static double square (int num1, int num2, int num3)
       {
           System.out.println(num1+"squared is: "+ Math.sqrt(num1));   
            System.out.println(num2+"squared is: "+ Math.sqrt(num2));   
           System.out.println(num3+"squared is: "+ Math.sqrt(num3)); 
           return(Math.sqrt(num1));
       }
       
    public static void main(String[] args) {
       
        Scanner keyedInput = new Scanner (System.in);
        
        int num1,num2,num3;
                
        System.out.println("Enter first number:");      
        num1=keyedInput.nextInt();
        
        System.out.println("Enter second number:");
        num2=keyedInput.nextInt();
        
        System.out.println("Enter third number: ");
        num3=keyedInput.nextInt();
       
        findingAvg(num1, num2, num3);
         
        squared(num1, num2,num3);
        
        adding(num1,num2,num3);
                
        multiply(num1,num2,num3);
                
        missingSideofATriangle(num1,num2);
        
        power(num1,num2);
        
        square(num1,num2,num3);
        
     
        
        
    }
    
}
