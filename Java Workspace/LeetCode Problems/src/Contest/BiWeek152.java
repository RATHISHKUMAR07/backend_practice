package Contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BiWeek152 {

	public static void main(String[] args) {
//		int[][]  arr = {{1,2,3,4},{0,2,2},{6,6,6},{1,3,5},{1,6,2,8,7}};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(totalNumbers(arr[i]));
//		}
		String[] words = {"ccd","adc","dba","bff","cbfae","fcae","cbbc"};//{"jump","run","run","jump","run"};
		int k = 2;
		int[] res = longestCommonPrefix(words, k);
		for(int n : res) {
			System.out.println(n);
		}
	}
	
	public static int[] longestCommonPrefix(String[] words, int k) {
        int[] res = new int[words.length];
        HashMap<String,Integer> occ = new HashMap<String, Integer>();
        for(int i=0;i<words.length;i++) {
        	occ.put(words[i], occ.getOrDefault(words[i], 0) + 1);
        }
        
        for(int i=0;i<words.length;i++) {
        	String val = "";
        	int flag = 0;
        	occ.put(words[i], occ.getOrDefault(words[i], 0) - 1);
        	for(Map.Entry<String, Integer> e : occ.entrySet()) {
            	if(e.getValue() >= k) {
            		if(flag == 0) {
            			val = e.getKey();
            			flag = 1;
            		}
            		if(val.length() < e.getKey().length()) {
            			val = e.getKey();
            		}
            		
            	}
            }
        	res[i] = val.length();
        	occ.put(words[i], occ.getOrDefault(words[i], 0) + 1);

        }
        
        return res;
	}
	
	public static int totalNumbers(int[] digits) {
		HashSet<Integer> unique = new HashSet<Integer>();
        int len = digits.length;
		for(int i=0;i<len;i++) {
			int left = 0;
			int right = len-1;
			while(left < len && right >= 0) {
					if( i != left && i != right && left != right) {
					int n1 = formDigits(digits[i], digits[left], digits[right]);
					int n2 = formDigits(digits[i], digits[right], digits[left]);
					int n3 = formDigits(digits[left], digits[i], digits[right]);
					int n4 = formDigits(digits[left], digits[right], digits[i]);
					

					if(n1 % 2 == 0 && n1 > 99) {
						unique.add(n1);
					}
					if(n2 % 2 == 0 && n2 > 99) {
						unique.add(n2);
					}
					if(n3 % 2 == 0 && n3 > 99) {
						unique.add(n3);
					}
					
					if(n4 % 2 == 0 && n4 > 99) {
						unique.add(n4);
					}
					
				}
				left++;
				right--;
			}
		}
		for(int n : unique) {
			System.out.print(n + " - ");
		}
		System.out.println();
		return unique.size();
    }
	
	public static int formDigits(int x, int y, int z) {
		return x * 100 + y * 10 + z;
	}

}

