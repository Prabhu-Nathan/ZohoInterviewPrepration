class EquilibriumPoint{

	public static void main(String arg[]){
		int arr[]={1,3,5,2,2};
		System.out.println(equilibriumPoint(arr));
	}
	/*
		the equilibrimpoint is left side sum is equal to right side sum that possition point is equilibrium point
		
		ex: 
		[1 3 5 2 2] array

		left side 1+2=4, mid is 5(index 2) ,right side 2+2=4
		2 is the equilibrium point

		solution: 

			the array have 1 element then the equilibrium point is arr[0]
			the array have 2 elements then the array dost not have equilibrium point 
			the array have morthen 2 elements then foollow the below steps 
			
			first find the sum array for array[1,3,5,2,2]
			the sum array is [1,4,9,11,13]
			then loop throw  the array index 1 to index n-1
			find left sum = sum[i]-arr[i] // sum=3-4=1
			find right sum =sum[i]-totalSum // total sum is 13 beacuse this is the last iteration
											// 13-4= 9
			if leftsum==rigthsum then return i // because the equilibrium point is fnded
			else loop throw again
			i=2
			leftsum=sum[i]-arr[i] // 9-5=4
			rightsum=totalsum-sum[i]// 13-9=4
			if leftsum==right sum 
			 	then return i
			 problem is solved 

			 ans the equilibrium is possition 2

	*/
	public static int  equilibriumPoint(int arr[]){
		int sum[]=new  int[arr.length];
	
		// finding sum  array 
		for(int i=0;i<sum.length;i++){
			if(i==0){
				sum[i]=arr[i];
			}
			else{
				sum[i]=arr[i]+sum[i-1];
			}
			
		}
		// finding equlibrium point

		int leftSum=0,rigthSum=0,totalSum=sum[sum.length-1];

		for(int i=1;i<sum.length;i++){
			leftSum=sum[i]-arr[i];
			rigthSum=totalSum-sum[i];
			if(leftSum==rigthSum)
				return i;
		}
		return -1;
	}
}



















