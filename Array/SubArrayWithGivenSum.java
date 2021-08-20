import java.io.*;
import java.util.*;
class SubArrayWithGivenSum{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=6;//sc.nextInt();
		int a[]={15,2,4,8,9,5,10,23};
		
		//for(int i=0;i<n;i++)
		//	a[i]=sc.nextInt();
		
		System.out.println("enter the num to find sub array");
		int num=sc.nextInt();

		int left=0,right=0,sum=0,flag=0;
		while(left < n && right < n){
			if(sum<num){
				sum+=a[right++];
			}
			else if(sum>num){
				sum-=a[left++];
			}
			else if(sum==num){
				//System.out.println("starting position "+left+" end possitopn"+right);
				flag=1;
				break;

			}
		}
		if(flag==1){
			for(int i=left;i<right;i++){
			System.out.print(a[i]+" ");
			}	
		}
		else{
			System.out.println("subarray not found");
		}
		

 
	}
}
