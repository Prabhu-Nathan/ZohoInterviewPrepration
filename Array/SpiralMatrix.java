class SpiralMatrix{
	public static void main(String arg[]){
		int arr[][] = {
				{1, 2, 3, 4},
	        	{5, 6, 7, 8},
	        	{9, 10, 11, 12},
	        	{13, 14, 15,16}
       };
       spiralMatrix(arr,arr.length);
	}
	public static void spiralMatrix(int arr[][],int n){
		int top=0,down=n-1,left=0,right=n-1;
		int pos=0;
		while(top<=down&&left<=right){
			if(pos==0){
				for(int i=top;i<=right;i++){
					System.out.print(arr[top][i]+" ");
				}
				top++;
				pos=1;
			}
			if(pos==1){
				for(int i=top;i<=down;i++){
					System.out.print(arr[i][down]+" ");
				}
				right--;
				pos=2;
			}
			if(pos==2){ 

				for(int i=right;i>=left;i--){
						System.out.print(arr[down][i]+" ");
				}
				down--;
				pos=3;

			}
			if(pos==3){
					for(int i=down;i>=top;i--){
						System.out.print(arr[i][left]+" ");
					}
					left++;
					pos=0;
					
			}

		}
	}
}