package corejavapart3;

import java.util.Scanner;

public class ProSumE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,j,k,sum=0,temp=0;
         Scanner s=new Scanner(System.in);
         System.out.println("enter array size");
         n=s.nextInt();
         if(n<0)
         {
        	 System.out.println("Invalid arraySize");
        	 System.exit(0);
         }
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
        	 arr[i]=s.nextInt();
        	 if(arr[i]<0)
        	 {
        		 System.out.println("Invalid input");
        		 System.exit(0);
        	 }
         }
         for(int i=0;i<n;i++)
         {
        	 for(j=i+1;j<n;j++)
        	 {
        		 
        	 }
         }
	}

}
