class TrapingRainWater{
	public static void main(String arg[]){
		int arr[] = {6,9,9};
		trapingRainWaterSol(arr);
	}

	/*
	
		sol:
			single block cannot store water
			two block cannot store water 
			if morethen 2 block can be store water
			morethen 2 block  in assecending order or desecending order cannot store water

			this prablem we use 2 pointer solution
			first pointer denote 0 index
			ssecond pointer desnote n-1
			leftmax=0 rightmax=0
			water =0
			loopthe prblem 
			first calculte left max and right max
			next find the water level and calculate the raping water 	
	*/
	public static void  trapingRainWaterSol(int arr[]){
		int left=0,right=arr.length-1;
		int leftmax=0,rightmax=0;
		int water =0;
		while(left<right){
			// calculate the leftmax
			if(leftmax<arr[left]){
				leftmax=arr[left];
			}
			// calculate right max
			if(rightmax<arr[right]){
				rightmax=arr[right];
			}

			// caculation bassed on the water level
			// minimum max level is the water level
			if(leftmax<rightmax){
				water+=leftmax-arr[left];
				left++;
			}
			else{
				water+=rightmax-arr[right];
				right--;
			}
		}
		System.out.println("the total traping water is : "+water);

	}
}