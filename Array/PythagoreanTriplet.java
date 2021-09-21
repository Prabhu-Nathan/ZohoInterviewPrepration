class PythagoreanTriplet{
	
	public static int a[]=new int[10000000];
	public static void main(String arg[]){
		int arr[] = {4, 49, 1, 59, 19, 81, 97, 99,82, 90, 99, 10, 58, 73, 23};
		if(checkTriplet(arr,arr.length)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

    static boolean checkTriplet(int[] arr, int n) {
        // code here
      
        for(int i=0;i<n;i++){
            a[arr[i]]=square(arr[i]);
            //System.out.print(a[arr[i]]+" ");
        }
            
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
            	// squareroot value  a[sqrroot(a[arr[i]]+a[arr[j]])]
                if(a[arr[i]]+a[arr[j]]==a[sqrroot(a[arr[i]]+a[arr[j]])]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int  square(int n){
        return n*n;
    }
    public static int sqrroot(int n){
		/*
			this technique is minus odd number
			ex:
				number is 9

				count 1: 9-1
				count 2: 8-3
				count 3: 5-5
				
				so count is the srquare root  3
				sqrt  is 3
		*/
		int count=0;
		for(int i=1;i<=n;i+=2){
			n=n-i;
			count++;
			if(n<=0)
				break;
			
		}
		return count;
	}
}