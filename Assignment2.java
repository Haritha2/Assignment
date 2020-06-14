import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Assignment2
{
	
	public static void main(String[] args)
	{
	
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int myInt=scanner.nextInt();
        scanner.close();
        System.out.println("number: " +myInt);

        List<Integer>list2=new ArrayList<>();
        list2=digitsOfNumber(myInt);
        System.out.print("digits in the number is :"+list2);
		
	}
	public  static List<Integer>digitsOfNumber(int num)
	{
		String xyz=Integer.toString(num);
		List<Integer>list1=new ArrayList<>();
			
			for(int i=0;i<xyz.length();i++)
			{
				list1.add(xyz.charAt(i)-'0');
			}
			return list1;
		
	}
}