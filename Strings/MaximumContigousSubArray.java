import java.io.*;
import java.util.*;
class MaximumContigousSubArray{
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(" \n the maximum contigous sub array sum is : "+mcsa(arr));
	}
	public static int mcsa(int arr[]){
		// initilize maximum ending and maximum so for
        // maximum ending is the current max value
        // maximum so for is last ma value
        int men=0;
        int msf=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

        	men=men+arr[i];
        	// if msn < current array element 
        	// then update the men = current element
        	if(men<arr[i]){
        		men=arr[i];
        	}
        	// if the currrent max value is greater then (msf) maximum so for
        	// then update the (msf) = msn
        	if(msf<men){
        		msf=men;
        	} 
        }
        // return the maximum so for value 
        // msf is the last greaatest contigous sub array sum
        return msf;
	}
}