package Round_930;
//

//import java.util.*;
//
//
//public class Pinball {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for (int i = 0; i < t; i++) {
//			int n = sc.nextInt();
//			String s = sc.next();
//
//			int arr[] = funcPinball(s, n);
//			Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
//			System.out.println();
//		}
//	}
//
//	public static int[] funcPinball(String str, int n) {
//		int arr[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			int seconds = 0;
//			char[] direction = str.toCharArray();
//			int start = i;
//			boolean flag = true;
//			while (flag) {
//				if (direction[start] == '<' && start == 0) {
//					direction[start] = '>';
//					seconds++;
//					flag = false;
//					break;
//				} else if (direction[start] == '>' && start == n - 1) {
//					direction[start] = '<';
//					seconds++;
//					flag = false;
//					break;
//				} else if (direction[start] == '<') {
//					direction[start] = '>';
//					start--;
//					seconds++;
//				} else if (direction[start] == '>') {
//					direction[start] = '<';
//					start++;
//					seconds++;
//				}
//
//			}
//			arr[i] = seconds;
//		}
//		return arr;
//	}
//}

import java.util.*;
import java.util.Map.Entry;

public class Pinball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		HashMap<StringBuilder,Integer> update = new HashMap<>();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			StringBuilder str = new StringBuilder(sc.next());

			for (int i = 0; i < n; i++) {
				int seconds = 0;
				int start = i;
				boolean flag = true;
				if(update.containsKey(str) && str.charAt(start) == '<' && start == 0) {
					System.out.println();
					int val = update.get(str);
					System.out.print(val + " ");
				}
				else if(update.containsKey(str) && str.charAt(start) == '>' && start == n - 1) {
					System.out.println();
					int val = update.get(str);
					System.out.print(val + " ");
				}
				else {
					while (flag) {					
						switch (str.charAt(start)) {
						case '<':
							if (start == 0) {
								str.replace(0,1,">");
								seconds++;
								flag = false;
							} else {
								str.replace(start,start + 1,">");
								start--;
								seconds++;
							}
							break;
						case '>':
							if (start == n - 1) {	
								str.replace(n-1,1,"<");
								seconds++;
								flag = false;
							} else {
								str.replace(start,start + 1,"<");
								start++;
								seconds++;
							}
							break;
						}
				}
				
					
					
				}
				if (i != n - 1) {
					System.out.print(seconds + " ");
					update.put(str, seconds);
				}
				else {
					System.out.println(seconds);
					update.put(str, seconds);
				}

				System.out.flush();
			}
			System.out.println(update);

		}
		sc.close();
	}
}
