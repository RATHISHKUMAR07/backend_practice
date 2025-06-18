package Example5;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answers;
	
	Question(){
		System.out.println("Default Constructor");
	}
	Question(int id,String name,List<String> answers){
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	public void showDetails() {
		System.out.println("Id : "+id +"\nName : "+name);
		
		Iterator<String> itr = answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
