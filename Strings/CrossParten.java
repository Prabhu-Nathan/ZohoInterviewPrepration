import java.io.*;
import java.util.*;
class CrossParten{
	public static void main(String arh[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
				if((i==j) || (i+j)==str.length()-1 ){
					System.out.print(str.charAt(i));
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
