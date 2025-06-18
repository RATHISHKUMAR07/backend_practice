
public class XPattern {
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int len = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == j)
					System.out.print(s.charAt(i));
				
				if (i + j == s.length() - 1 && i != j) 
					System.out.print(s.charAt(len - i));
	
				System.out.print("  ");
			}
			System.out.println();

		}
	}
}
