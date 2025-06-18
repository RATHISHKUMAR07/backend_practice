package Example6;

import java.util.*;

public class Question {
	private int id;
	private String name;
	private List<Answer> answer;
	
	Question(int id,String name,List<Answer> answer){
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	void showDetails() {
		System.out.println("Id : "+id+"\nName : "+name);
		System.out.println("Answers are");
		
		Iterator<Answer> itr = answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
