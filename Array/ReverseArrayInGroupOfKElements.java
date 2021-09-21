class ReverseArrayInGroupOfKElements{
	public static void main(String arg[]){
		 int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		 int k=3;
		 reverseArrayInGroupOfKElements(arr,k);
	}
	public static void reverseArrayInGroupOfKElements(int arr[],int k){
		for(int i=0;i<arr.length;i+=k){
			int start=i;
			int end=Math.min(i+k-1,arr.length-1);
			while(start<=end){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;end--;

			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}