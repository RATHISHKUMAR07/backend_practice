package patterns;

public class DiamondNumericPattern {

	public static void main(String[] args) {
		int n = 5;
		int totalRow = 2*n-1;
		for(int row=1;row<= totalRow;row++) {
			int spaceNo = (row > n)?2*n - row:row;
			for(int space=0;space<spaceNo;space++) {
				System.out.print(" ");
			}
			for(int col = spaceNo;col<=n;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
