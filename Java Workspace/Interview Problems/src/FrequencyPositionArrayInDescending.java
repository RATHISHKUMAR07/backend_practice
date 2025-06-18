import java.util.Arrays;

public class FrequencyPositionArrayInDescending {

	public static void main(String[] args) {
		//int arr[] = {5,2,3,3,1,4,4,4,6,2};
		int arr[] = {-1,4,3,3,1,5,-1021033,101,101,22,3,1010101,500,500,2,3,3,1,4,1000,770,4,4,6,2};
		int len =  arr.length;
		int count[] = new int[len];
		int countSort[] = new int[len];
		int res[] = new int[len];
		
		Arrays.fill(count,1);
		for(int i=0;i<len;i++) {
			int j = i;
			while(++j<len) {
				if(arr[j] == arr[i] && count[i] != -1) {
					count[i]++;
					count[j] = -1;
				}
			}
		}
		
		for(int i = 0;i<len;i++) {
			countSort[i] = count[i];
		}
		
		Arrays.sort(countSort);
		int index = 0;
		for(int i=len-1;i>=0 && countSort[i] != -1 ; i--) {
			for(int j=0;j<len;j++) {
				if(count[j] == countSort[i]) {
					int var = arr[j];
					int loop = count[j];
					int flag = 0;
					while(--loop >= 0) {					
						res[index] = var;
						count[j] = -1;
						index++;
						flag = 1;
					}
					if(flag == 1) {
						break;
					}
				}
			}
		}
		
		for(int a : count) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a : countSort) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a : res) {
			System.out.print(a+" ");
		}
	}

}
