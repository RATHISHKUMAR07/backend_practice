import java.util.Scanner;
//sort in ascending and the element next element is greater 
//but we hava to print in number order
public class arrayNextGreaterElemet {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int b = 0;
		int a = 0;
		int flag = 0;
		for(int i = 0;i < size;i++) {
			for(int j = 0;j < size;j++) {
				if(arr[j] > arr[i] & flag != 1) {
					b = arr[j];
					flag = 1;
				}
				for(int k = 0;k<size && flag == 1;k++) {
					if(arr[i] > b && b < arr[k]) {
						b = arr[k];
					}
				}
			}
			System.out.println(arr[i]+"->"+b);
			b = 0;
			flag = 0;
			a = 0;
		}
		
		sc.close();
	}

}
