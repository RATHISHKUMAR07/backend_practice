package Easy;

public class MinRecolorsToGetKConsecutiveBlocks {

	public static void main(String[] args) {
		String blocks = "WBWBBBW";
		int k = 2;
		
		System.out.println(minimumRecolors(blocks, k));
	}
	
	public static int minimumRecolors(String blocks, int k) {
		int i = 1;
		int j = k;
		int len = blocks.length();
		
		int operCount = 0;
		
		for(int x=0;x<k;x++) {
			if(blocks.charAt(x)=='W') {
				operCount++;
			}
		}
		if(operCount == 0) {
			return 0;
		}
		int dupCount = operCount;
		while(j < len) {
			if(blocks.charAt(i-1) == 'W') {
				dupCount--;
			}
			if(blocks.charAt(j) == 'W') {
				dupCount++;
			}
			operCount = Math.min(dupCount, operCount);
            if(operCount == 0){
                return 0;
            }
			i++;
			j++;
			
		}
		
		
		return operCount;
        
    }
	

}
