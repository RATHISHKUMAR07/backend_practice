package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class practice {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			values.add(i);
		}
		
		values.stream().forEach(System.out::println);
		
		//filter() - is a lazy we have use intermediate or terminate methods
		//like forEach, map, findFirst()
		System.out.println(values.stream().filter(i -> {
			System.out.println("Hi");
			return true;
		}).findFirst());
		//we can use orElse(0) to print value without optional
		System.out.println("================");

		
		List<Integer> nums = Arrays.asList(3,1,5,4,2);
		
		//stream can be consumed only once
		Stream<Integer> data = nums.stream();
		//sorted() Returns a stream
		Stream<Integer> sortedData = data.sorted();
		sortedData.forEach(n -> System.out.println(n));
		
		System.out.println("================");

		Stream<Integer> data1 = nums.stream();
		Stream<Integer>  mappedData = data1.map(n -> n*2);
		mappedData.forEach(n -> System.out.println(n));
		//or
		System.out.println("================");
		
		Function<Integer,Integer> func = n -> n * 2;
		
		nums.stream()
			.filter(n-> n%2 == 1)
			.sorted()
			.map(func)
			.forEach(n -> System.out.println(n));
		
		System.out.println("================");
		int sum = nums.stream()
				.filter(n-> n%2 == 1)
				.sorted()
				.map(n -> 2 * n)
				.reduce(0, (c, e) -> c+e);
		System.out.println(sum);
		

		
	}

}
