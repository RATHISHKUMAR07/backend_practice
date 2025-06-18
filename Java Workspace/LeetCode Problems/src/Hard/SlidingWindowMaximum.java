package Hard;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int[] res = maxSlidingWindow(arr, k);
		for(int a : res) {
			System.out.print(a + " ");
		}

	}
	public static int[] maxSlidingWindow(int[] nums,int k) {
		int[] max_left = new int[nums.length];
        int[] max_right = new int[nums.length];

        max_left[0] = nums[0];
        max_right[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            max_left[i] = (i % k == 0) ? nums[i] : Math.max(max_left[i - 1], nums[i]);

            int j = nums.length - i - 1;
            max_right[j] = (j % k == 0) ? nums[j] : Math.max(max_right[j + 1], nums[j]);
        }

        int[] sliding_max = new int[nums.length - k + 1];
        for (int i = 0, j = 0; i  < sliding_max.length; i++) {
            sliding_max[j++] = Math.max(max_right[i], max_left[i + k - 1]);
        }

        return sliding_max;
	}
}

//	    public int[] maxSlidingWindow(int[] nums, int k) {
//	        int len = nums.length;        
//	        int resLen = nums.length - k + 1;
//	        int[] arr = new int[resLen];
//	        for(int i=0;i<resLen;i++){
//	            arr[i] = (findMax(i,i+k-1,nums));
//	        }       
//	        System.out.print(len+ " "+resLen); 
//	        return arr;
//	    }
//	    public int findMax(int start,int end,int[] nums){
//	        int max = Integer.MIN_VALUE;
//	        while(start<=end){
//	            max = (max < nums[start])?nums[start]:max;
//	            max = (max < nums[end])?nums[end]:max;
//	            start++;
//	            end--;
//	        }
//	        return max;
//	    }
	

