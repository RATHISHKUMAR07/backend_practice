import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println(isAnagram("ammaa", "mama"));
	}
	/*
	 melon , lemon 
	 amma , mama
	 lemon , demon
	 demo, demon
	 */
	public static boolean isAnagram(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		HashMap<Character, Integer> map = new HashMap<>();
		if(len1 != len2)
			return false;
		else {
			
			for(int i=0;i<len1;i++) {
				char c = s1.charAt(i);
				char c1 = s2.charAt(i);
				map.put(c, map.getOrDefault(c, 0) + 1);
				map.put(c1, map.getOrDefault(c1, 0)-1);
			}	
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue() != 0) {
				return false;
			}
		}
		return true;
		
		
		
			
	}

}
