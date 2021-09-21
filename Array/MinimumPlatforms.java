import java.util.*;
class MinimumPlatforms{
	
	public static void main(String arg[]){
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		findMinimumPlatforms(arr,dep);
	}
	/*
	900, 940, 950, 1100, 1500, 1800
	910, 1200, 1120, 1130, 1900, 2000

	calculate a minimum platform for the train arraival time and depature time 
	
	points:
	no train keep wait for arrival
	consider all train arrival at same day
	if not possible one arrival  and one train dipature at the same time
		
		solution:
		sort a arrival time and depature time 
		platform=1,maxPlatform=1 because one platform minimum requird for train arrival and deppature
		useing two ponters in while loop
		i=1 for next arrrival train,j=0 depature time

	*/
	public static void findMinimumPlatforms(int arr[],int dep[]){
			Arrays.sort(arr);
			Arrays.sort(dep);
			int i=1,j=0;
			int platform=1,maxPlatform=1;
			while(i<arr.length&& j<arr.length){
				// if arrival time is lesthen or equal to depature time so more  platform needed for train arraival
				if(arr[i]<=dep[j]){
					platform++;
					i++;
				}
				// if arraival time is lesthan depature time then no platform needed for new train arraival so decrement platform
				else if(arr[i]>dep[j]){
					platform--;
					j++;
				}

				// if the platform is lesthen maximimplatform then assign the valu of maxplatform for the platform
				if(platform>maxPlatform){
					maxPlatform=platform;
				}
			}
			System.out.println(maxPlatform);
	}
}






















