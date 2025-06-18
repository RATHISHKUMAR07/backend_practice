package method.reference;

import java.util.Arrays;
import java.util.List;

interface Parser{
	String parse(String str);
}
class StringParser{
	public static String convert(String s) {
		if(s.length() <= 3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		
		return s;
	}
}
class MyPrinter{
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}
public class practice {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Rathish","Naveen","Nishanth","Chandini");
		
		//Method reference println is a method (:: - it tells compiler it is a method)
		names.forEach(System.out::println);
		
		String name = "Rat";
		MyPrinter mp = new MyPrinter();
		//lamda
		mp.print(name, (s -> StringParser.convert(s)));
		//or
		//method referrence
		mp.print(name, (StringParser::convert));
		
		
		
		
	}

}
