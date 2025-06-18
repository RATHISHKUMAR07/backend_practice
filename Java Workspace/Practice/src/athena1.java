import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class athena1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is having duplicate values
		String s = "raathish";
		StringBuilder sb = new StringBuilder();
		HashMap<Character,Integer> hs = new HashMap<>();
		
		

		for(int i =0;i<s.length();i++) {
			if(!hs.containsKey(s.charAt(i))) {
				hs.put(s.charAt(i), 1);
			}
			else {
				hs.getOrDefault(hs.get(s.charAt(i)) + 1, 0);
			}
		}
		
		System.out.println(sb.toString());
		
//		
//		for(int i =0;i<s.length();i++) {
//			if(!hs.contains(s.charAt(i))) {
//				sb.append(s.charAt(i));
//				hs.add(s.charAt(i));
//			}
//			else {
//				System.out.println(s.charAt(i));
//			}
//		}
//		
//		System.out.println(sb.toString());
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int n = 3;
//		
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		
//		for(int i = 0;i<arr.length;i = i + n) {
//			System.out.println(sumOf(i,i+n,arr));
//		}
		
		
	}
	
	public static int sumOf(int i,int j, int[] arr) {
		int sum = 0;
		for(int low = i;(low < arr.length) && low<j;low++) {
			sum += arr[low];
		}
		return sum;
	}

}
