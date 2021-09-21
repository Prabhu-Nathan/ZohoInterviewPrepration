class ConvertrrayInToZigZagFashion{
	public static void main(String arg[]){
		int arr[]= {4, 3, 7, 8, 6, 2, 1};
		convertZigZag(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	/*
					// output 3 < 7 > 4 < 8 > 2 < 6 > 1
			 		// if even possition < lesthen right side 
			 		// if odd  possition > left side

	*/
	public static void convertZigZag(int arr[]){
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++){
			 

			 if(i%2==0 && arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            else if(i%2==1&& arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
		}
	}
}