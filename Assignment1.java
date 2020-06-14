import java.util.*;
public class Assignment1
{

	public static void main(String[] args) 
	{
		
		boolean ans;
		int[] arr = new int[50];
		Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=scanner.nextInt();
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++) {
        	arr[i]=scanner.nextInt();
        }
        System.out.println("enter the number to be searched");
        int num=scanner.nextInt();
		ans=checkforelement(arr,num);
		if (ans)
			System.out.println("the list contain "+num);
		else
			System.out.println("the list does not contains "+num);

	}


		public static boolean checkforelement(int[] arr,int element)
		{
			for(int a:arr)
				{
					if(a==element)
					{
						return true;
					}
				}		
			return false;
					
			
		}
	
}
