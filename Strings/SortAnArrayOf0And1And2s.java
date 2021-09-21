class SortAnArrayOf0And1And2s{
	
	public static  int arr[]={1,0,2,0,1,2};

	public static void main(String args[]){
		
		sortAnArray0sAnd1sAnd2s();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}

	}

	public static void sortAnArray0sAnd1sAnd2s(){
		
		/*
			consept:
			i = start // starting possition 0
			m= middle // starting possition 0
			n= end    // starting possition end-1;
			
			3 condition can apply for solve this problem
			conditions: 
			
			1.mid is equal to 0 then swap the i and mid possition and increment i++ and mid++
			2.mid is equal to 1 then just increment the mid possition mid++
			3.mid is equal to 2  then swap the mid and end possition then decriment the end possition end--

			[1,0,2,0,1,2] 
			
		*/

			int i=0,mid=0,end=arr.length-1;
			while(mid<=end){
				
				if(arr[mid]==0){
					int temp=arr[i];
					arr[i]=arr[mid];
					arr[mid]=temp;
					i++;mid++;
				}

				else if(arr[mid]==1){
					mid++;
				}
				else if(arr[mid]==2){
					int temp=arr[mid];
					arr[mid]=arr[end];
					arr[end]=temp;
					end--;	
				}
			}
	}
}





















