import java.util.*;
import java.io.*;
class FindMissingNumInArray{
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n-1];
		for(int i=0;i<n-1;i++)
			arr[i]=sc.nextInt();
		System.out.println("\n the missing number is : "+missingNumberInArray(arr,n));
	}
	public static int missingNumberInArray(int arr[],int n){
		int totalsum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<n-1;i++){
			sum+=arr[i];
		}
		return totalsum-sum;
		return 
	}
}