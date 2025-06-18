package Example14;

import java.util.*;
import java.util.Map.Entry;

public class Question {
	private int id;
	private String name;
	private Map<Answer,User> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Answer,User> getAnswers(){
		return answers;
	}
	public void setAnswers(Map<Answer,User> answers) {
		this.answers = answers;
	}

	void show() {
		System.out.println("Id : "+id+"\nName : "+name);
		System.out.println("Answers...");
		
		Set<Entry<Answer,User>> set = answers.entrySet();
		Iterator<Entry<Answer,User>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<Answer,User> entry = itr.next();
			
			Answer answer = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Info");
			System.out.println(answer);
			System.out.println("Posted By");
			System.out.println(user);
		}
		
	}
}
