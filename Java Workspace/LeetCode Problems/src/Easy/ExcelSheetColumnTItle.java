package Easy;

public class ExcelSheetColumnTItle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(705));
	}
	public static String convertToTitle(int columnNumber) {
		String s = "";
		if (columnNumber < 27) {
			s = s + (char) (columnNumber + 64);
			return s;
		}
		while (columnNumber > 0) {
			int rem = columnNumber % 26;
			if(rem <= 26)
				s = s + (char) (columnNumber/26 + 64);
			if (rem > 0 && rem < 27) {
				s = s + (char) (rem + 64);
				columnNumber = rem/26;
			}
			else {
				s = s ;
			}
			
		}
		return s;
	}
}
