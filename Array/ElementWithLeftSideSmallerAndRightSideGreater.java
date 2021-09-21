class ElementWithLeftSideSmallerAndRightSideGreater{
	public static void main(String arg[]){
		int arr[]={10, 6, 3, 1, 5, 11, 6, 1, 11, 12};
		findPivoteElement(arr);
	}
	/*
		solution 
		fist find minimum array and maximum array
		then loop the main array check current array element lesthen or equal min arry and 
		current elementand greaterthen or equal right side max or eqqual to current arrray
	*/
	
	public static void findPivoteElement(int arr[]){
		int leftmax[]=new int[arr.length];
		int rigthmin[]=new int[arr.length];
		int len=arr.length;
		leftmax[0]=arr[0];
		rigthmin[len-1]=arr[len-1];
		// if -1 could not find pivote element
		int possition =-1;
		// get min array elements
		
		for(int i=1;i<arr.length;i++){
			leftmax[i]=leftmax[i-1]>arr[i]?leftmax[i-1]:arr[i];
		}

		// get rigth min array element
		for(int i=len-2;i>0;i--){
			rigthmin[i]=rigthmin[i+1]<arr[i]?rigthmin[i+1]:arr[i];
		}

		System.out.println();
		// calculate pivote element
		for(int i=1;i<len-1;i++){
			if(leftmax[i-1]<=arr[i]&& arr[i]<=rigthmin[i+1]){
				possition=i;
				break;
			}
		}
		if(possition!=0){
			System.out.println(arr[possition])	;
		} 
		else{
			 System.out.println(possition)	;
		}

	}
}