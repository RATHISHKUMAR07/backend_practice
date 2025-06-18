import java.util.*;
public class sortAndRemoveDuplicatesInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		int loop = 10;
		while(loop != 0) {
			int value = sc.nextInt();
			list.add(value);
			loop--;
		}
		Set<Integer> newSet = new LinkedHashSet<Integer>();
		newSet.addAll(list);
		
		list.clear();
		
		list.addAll(newSet);
		
		System.out.println(newSet);
		
		
		sc.close();
		
	}

}
