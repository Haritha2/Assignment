import java.io.*; 
import java.util.Scanner;
  
public class Assignment3
 { 
  
     public static void main(String[] args) 
    { 
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the numbers");
        int n=scanner.nextInt();
        series(n);
    } 

   public static void series(int n) 
    { 
        float i; 
        float sum=0; 
        for(i=1;i<=n;i++)
        { 
            float div=(2*i)-1;
            sum += 1/div; 
        } 
        System.out.println(sum); 
    } 
 } 
    
   