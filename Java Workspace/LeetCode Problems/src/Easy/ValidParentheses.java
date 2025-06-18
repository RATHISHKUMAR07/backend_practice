package Easy;
import java.util.*;
public class ValidParentheses {

	public static void main(String[] args) {

	}

	public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < s.length(); i++) {
	        	char top,next;
	            if(stack.isEmpty()){
	                stack.push(s.charAt(i));
	            }
	            else{
	                top = stack.peek();    
	                next = s.charAt(i);
	                if (top == '(' && next == ')' || top == '{' &&  next == '}' || top == '[' &&  next == ']')
	                    stack.pop();
	                else
	                    stack.push(s.charAt(i));
	            }
	        }
	        return stack.isEmpty();
	}
}
