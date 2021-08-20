import java.util.*;
import java.io.*;
class CountTheTriples{
	//initilize the all elements in zero
	static int a[]=new int[100000];
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		// set array length
		int n=sc.nextInt();
		int arr[]=new int[n];
		// scan the array 
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		// count the triples
		System.out.print("\n the triples in the array is : "+countTriples(arr));

	}

	public static int countTriples(int arr[]){
		int count=0;
		// change the global (a) array values in  zero to one for perticular (arr) array values possition
		for(int i=0;i<arr.length;i++)
			a[arr[i]]=1;

		// count the triples in array

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){

				// if i+j is equal to 1 then incriment the count
				if(a[arr[i]+arr[j]]==1){
					count++;
				}
			}
		}   
		return count;
	}
}
