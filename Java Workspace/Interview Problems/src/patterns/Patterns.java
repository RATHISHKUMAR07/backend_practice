package patterns;

public class Patterns {

	public static void main(String[] args) {
		
		
		pattern16(5);
		System.out.println();
		pattern31(5);
		System.out.println();
		pattern17(4);
		System.out.println();
		pattern30(4);


	}
	
	static void pattern16(int n) {
		for(int row = 0;row<n;row++) {
			for(int space=0;space<n-row;space++) {
				System.out.print("  ");
			}
			int currentValue = 1;
			for (int col = 0; col <= row; col++) {
                System.out.print(currentValue + "   ");
                currentValue = currentValue * (row - col) / (col + 1);
            }
			System.out.println();
		}
	}
	static void pattern31(int n) {
		int orginalN = n;
		n = 2 * n - 1;
		for(int row=0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				int index = orginalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
				System.out.print(index+" ");
			}
			System.out.println();
		}
	}
	static void pattern17(int n) {
		for(int row = 1;row<=2*n;row++) {
			int c = (row > n)?2*n - row : row;
			for(int space = 0;space < n-c;space++) {
				System.out.print("  ");
			}
			for(int col = c;col >= 1;col--) {
				System.out.print(col+" ");
			}
			for(int col = 2;col <= c;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern11(int n) {
		for (int row = 1; row < 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("*");
            }

            for (int col = n; col >= n-c+1; col--) {
                System.out.print(col);
            }
            for (int col = n-c+2; col <= n; col++) {
                System.out.print(col);
            }
            for (int space = 0; space < n-c; space++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}
	
	static void pattern30(int n) {
		for(int row = 1;row<=n;row++) {
			for(int space = 0;space < n-row;space++) {
				System.out.print("  ");
			}
			for(int col = row;col >= 1;col--) {
				System.out.print(col+" ");
			}
			for(int col = 2;col <= row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern28(int n) {
		for(int row = 0;row < 2*n;row++) {
			int totalCol = (row > n)? 2*n - row:row;
			for(int space = 0 ;space<n - totalCol;space++) {
				System.out.print(" ");
			}
			for(int col = 0;col < totalCol;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for(int row = 0;row < 2*n;row++) {
			int totalCol = (row > n)? 2*n - row:row;
			for(int col = 0;col < totalCol;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for(int row = 1;row <= n;row++) {
			for(int col = 1;col <= row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int row = 1;row <= n;row++) {
			for(int col = row;col <= n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int row = 1;row <= n;row++) {
			for(int col = 1;col <= row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern1(int n) {
		for(int row = 1;row <= n;row++) {
			for(int col = 1;col <= n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	

}
