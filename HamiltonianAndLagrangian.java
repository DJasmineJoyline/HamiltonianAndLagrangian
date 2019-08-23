package pack1;
import java.util.Scanner;
public class HamiltonianAndLagrangian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int arr[] = new int[100];
		Scanner sc= new Scanner(System.in);
       System.out.println("Enter the value of n");
       n=sc.nextInt();
       System.out.println("Enter the array elements");
       for(int i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n;j++)
    	   {
    		   if(arr[j]>arr[i])
    			   break;
    		   if(j==n-1)
    			   System.out.println(arr[i]);
    	   }
    	   if(i==n-1)
    		   System.out.println(arr[i]);
    	   
       }
	}

}
