import java.util.*;

public class SecondLargestDiff{
	public static void main(String[] args){
	int[] arr1 = {33, 35, 1, 10, 12, 34};
	System.out.println(secondMaxDiff(arr1));
}
	static int secondMaxDiff(int[] arr){
	int smallest=arr[0];
	int secondSmallest=secondSmall(arr);
	int largest = arr[0];
	int secondLargest = secondLarge(arr);
	int diff = 0;
	for(int i=0;i<arr.length;i++){
		smallest=smallest>arr[i]?arr[i]:smallest;
		largest = largest<arr[i]?arr[i]:largest;
	}
	diff = secondLargest-smallest>largest-secondLargest?secondLargest-smallest:largest-secondLargest;
	return diff;
}
	static int secondLarge(int[] arr){
	int first,second;
	first = second = arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]>first){
			second = first;
			first = arr[i];
			}
		if(arr[i]>second && arr[i]<first){
			second =arr[i];
			}
		}
	return second;
}

	static int secondSmall(int[] arr){
	int first,second;
	first=second=arr[0];
	for(int i=1;i<arr.length;i++){
		if(first>arr[i]){
			second=first;
			first=arr[i];
			}
		if(second>arr[i] && arr[i]>first){
			second = arr[i];
		}
	}
	return second;
}
}