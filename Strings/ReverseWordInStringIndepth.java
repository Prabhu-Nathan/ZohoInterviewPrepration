import java.util.*;
import java.io.*;
public class ReverseWordInStringIndepth{
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();

		char rev[]=word.toCharArray();
		reverseWord(rev);
		System.out.println(rev);
	}
	public static void reverseWord(char c[]){
		int start =0,end;
		for( end=0;end<c.length;end++){
			if(c[end]==' '){
				rword(c,start,end-1);
				start=end+1;
			}
		}
		rword(c,start,end-1);
		//rword(c,0,c.length-1);
	}
	public static void  rword(char c[],int start,int end){

		while(start<=end){
			char temp=c[start];
			c[start]=c[end];
			c[end]=temp;
			start++;
			end--;
		}
	}
}
