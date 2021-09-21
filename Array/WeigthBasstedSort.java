import java.util.*;
import java.io.*;
public class WeigthBasstedSort{
	public static void main(String Arg[]){
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int a[]=new int[length];
		int weight[]=new int[length];
		for(int i=0;i<length;i++)
			weight[i]=0;
		
		for(int i=0;i<length;i++){
			a[i]=sc.nextInt();
			if(isSquare(a[i])){
				weight[i]+=5;
			}
			if(a[i]%6==0&& a[i]%4==0){
				weight[i]+=4;
			}
			if(a[i]%2!=0){
				weight[i]+=2;
			}
		}

		for(int i=0;i<length;i++){
			for(int j=0;j<length-1;j++){
				int k=j+1;
				if(weight[j]>weight[k]){
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
					int temp1=weight[j];
					weight[j]=weight[k];
					weight[k]=temp1;
				}
			}
		}
		for(int i=0;i<length;i++){
			System.out.print("<"+a[i]+","+weight[i]+"> ");
		}


	}
	private static boolean isSquare(int a){
		double sq= Math.sqrt(a);
		return 	(sq-Math.floor(sq)==0);
	}
}