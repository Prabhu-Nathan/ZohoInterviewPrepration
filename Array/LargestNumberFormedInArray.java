class LargestNumberFormedInArray{
	public static void main(String arg[]){
		String arr[] = {"3", "30", "34", "5", "9"};
		findLargestNumber(arr);
	}
	public static void findLargestNumber(String arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				String xy=arr[i]+arr[j];
				String yx=arr[j]+arr[i];

				if(Integer.parseInt(xy)<=Integer.parseInt(yx)){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(String a: arr){
			System.out.print(a);
		}
	}
}