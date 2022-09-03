import java.util.*;

public class SecondLargestDiff{
	public static void main(String[] args){
	int[] arr1 = {33, 35, 1, 10, 12, 34};
	System.out.println(secondMaxDiff(arr1));
}
	static int secondMaxDiff(int[] arr){
	int smallest=arr[0];
	int secondSmallest=secondSmall(arr); 		//calling function to find Second Smallest Number
	int largest = arr[0];
	int secondLargest = secondLarge(arr);		//Calling function to find Second Largest Number
	int diff = 0;
	for(int i=0;i<arr.length;i++){
		smallest=smallest>arr[i]?arr[i]:smallest;	//Finding Smallest Number
		largest = largest<arr[i]?arr[i]:largest;	//Finding Largest Number
	}
	diff = secondLargest-smallest>largest-secondLargest?secondLargest-smallest:largest-secondLargest; //Comparing the difference of (second largest & smallest) and (Largest & Second Smallest)
	return diff;
}
	static int secondLarge(int[] arr){ 	//Function to Find Second Largest
	int first,second;	
	first = second = arr[0];		//Initiallizing first and second as the zeroth element of array
	for(int i=1;i<arr.length;i++){
		if(arr[i]>first){		// if current element > first then
			second = first;		// assigning first largest value to second and
			first = arr[i];		// assigning the current value to first largest  
			}
		if(arr[i]>second && arr[i]<first){	//if current element > second largest and current element is < first largest then
			second =arr[i];			//assigning current element value to second largest.
			}
		}
	return second;
}

	static int secondSmall(int[] arr){
	int first,second;
	first=second=arr[0];			//Initiallizing first and second as the zeroth element of array
	for(int i=1;i<arr.length;i++){
		if(first>arr[i]){		//if first > current element  then
			second=first;		//assigning first smallest to second smallest
			first=arr[i];		//and assigning the current value to the first smallest
			}
		if(second>arr[i] && arr[i]>first){	//if second smallest > current element and current element > first smallest then
			second = arr[i];		// assigning current element value to second largest.
		}
	}
	return second;
}
}
