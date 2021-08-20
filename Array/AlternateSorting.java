import java.util.*;
import java.io.*;
public class AlternateSorting{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int a[]=new int[length];
		for(int i=0;i<length;i++){
			a[i]=sc.nextInt();
		}

		for(int i=0;i<length;i++){
			for(int j=0;j<length-1;j++){
				int k=j+1;
				if(a[j]>a[k]){
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		int i=0,j=length-1;
		while(i<j){
			System.out.print(a[i++]+" "+a[j--]+" ");
		}
		if(length%2==1){
			System.out.print(a[length/2]);
		}
	}
}
