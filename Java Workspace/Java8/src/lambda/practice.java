package lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface A{
	void show(int i);
}
class practice  {
	
	
	public static void main(String args[]) {

		lambdaExp();
	}
	
	public static void lambdaExp() {
			List<Integer> arr1 = Arrays.asList(4,5,6,7,8);
			List<String> arr2 = Arrays.asList("Rathish","Naveen");
			
			arr1.forEach(p -> {
				System.out.println(p);
			});
			//if doest provide zero means we have create "cannot convert from Optional<Integer> to int"
			int val = arr1.stream().reduce(0,(a,b) -> a+b);
			System.out.println(val);
			
			
			
			//lambda - Anonymous method
			A obj;
			obj = (i) -> System.out.println("Hello "+ i);
			obj.show(1);
			
			
			//Consumer interface
			Consumer<Integer> c1 = i -> System.out.println(i);
			arr1.forEach(c1);
			
			arr2.forEach(i -> System.out.println(i));
			
	}
}