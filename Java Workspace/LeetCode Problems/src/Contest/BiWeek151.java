package Contest;

import java.util.Arrays;

public class BiWeek151 {

	public static void main(String[] args) {
		int arr[] = {4,3,2,1,1,1,5,6};
		
		for(int a : transformArray(arr)) {
			System.out.print(a + " - ");
		}
		
		int arr1[] = {2,1,3,3};

	}
	
	//1
	public static int[] transformArray(int[] nums) {

		//While chanhge the numbers to 0 and 1 I tried to sort it , but I can't do it try solving this
        int len = nums.length;
        int oneIndex = -1;
        int oneSecInd = 0;
        for(int i=0;i<len;i++){

            if(nums[i] % 2 == 0){
                if(oneIndex != -1){
                    nums[oneIndex] = 0;
                    nums[i] = 1;
                    oneIndex = -1;
                }
                else{
                    nums[i] = 0;
                }                
            }
            else{
                nums[i] = 1;
                oneSecInd = oneIndex;
                oneIndex = i;
                
            }
        
        }
        return nums;
    }
	



}
