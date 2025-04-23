package javaDSA;

public class CountElementsGreaterThanAverage {

	public static void main(String[] args) {
		int arr[] = {23, 35, 12, 88, 67, 102, 1, 40};
		countGreaterAverage(arr);
	}
	public static void countGreaterAverage(int arr[]) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		
		double average = (double) sum / arr.length;
		
		int count = 0;
		for(int num : arr) {
			if(num > average) {
				count++;
			}
		}
		System.out.println(count);
	}
}
