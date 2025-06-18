import java.util.*;

public class secondMaxMin {


	public static void main(String[] args) {
		int arr[] = new int[] {10,5,2,12,9,3,4,1};
		//ArrayList to find Second Maximum and Minimum
		/*
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			aList.add(arr[i]);
		}
		Collections.sort(aList);
		System.out.println("Second Min - "+ aList.get(1));
		System.out.println("Second Max - "+ aList.get(arr.length - 2));
		*/
//		int len = arr.length;
//		int temp = 0;
//		for(int i=0;i<len;i++) {
//			for(int j=i+1;j<len;j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		int firstMax = arr[0];
		int firstMin = arr[0];
		int secMax = arr[0];
		int secMin = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] > firstMax) {
				secMax = firstMax;
				firstMax = arr[i];
			}
			if(arr[i] < firstMin) {
				secMin = firstMin;
				firstMin = arr[i];
				
			}
			
		}
		
		System.out.println("First Max - " + firstMax+ "\nFirst Min - " +firstMin);

		
		System.out.println("Second Max - " + secMax+ "\nSecond Min - " +secMin);
	}

}
