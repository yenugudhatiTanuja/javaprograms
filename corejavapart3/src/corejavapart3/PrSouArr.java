package corejavapart3;

import java.util.Scanner;

public class PrSouArr {

	static int  sum(int arr[], int n)
	{
		int max, max2, max3;
		 max3 = max = max2 = arr[0];
		   for(int i = 0; i < n; i++){
		      if (arr[i] > max){
		         max3 = max2;
		         max2 = max;
		         max = arr[i];
		      }
		      else if (arr[i] > max2){
		         max3 = max2;
		         max2 = arr[i];
		      }
		      else if (arr[i] > max3)
		         max3 = arr[i];
		   }
		   System.out.println("First Largest--->"+max);
		   System.out.println("Second Largest--->"+max2);
		   System.out.println("Third Largest--->"+max3);

		return max+max2+max3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
	   System.out.println("Enter size of the array");

       int n=s.nextInt();
       int[] arr=new int[n];
	   System.out.println("Enter array Elements");

       for(int i=0;i<n;i++)
       {
    	   arr[i]=s.nextInt();
       }
       int c=sum(arr,n);
       System.out.println("sum of largest 3 numbers in array--->"+c);
	}

}
