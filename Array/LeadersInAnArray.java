import java.util.*;
class LeadersInAnArray{
	public static void main(String arg[]){
		int a[]={16,17,4,3,5,2};
		findLeaders(a);
	}
	/*
	the problem is find a leaders in a array
	the leaders repprecent the right possitions of element is less then current element
	the right hand side values are low then the current element is a leader

	sollution
	
	last most element has always a  leader because the rigth hand side is no elements in the array
	
	[16,17,4,3,5,2]
	
	travers a array from reverse
	declar a variable leader
	leader = last element thn print
	i=length--
	i=4
	if a[4]>leader then print a[i] and assign  the current element to leader
	else loop again

	.........

	*/
	public static void findLeaders(int a[]){
		int leader=0;
		Stack<Integer> list=new Stack<>();
		for(int i=a.length-1;i>=0;i--){
			if(a[i]>=leader){
				leader=a[i];
				list.push(a[i]);
			}
		}
		while(!list.isEmpty()){
			System.out.print(list.pop()+" ");
		}
	}
}













