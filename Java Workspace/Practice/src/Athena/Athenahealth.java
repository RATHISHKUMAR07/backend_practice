package Athena;
import java.util.*;
public class Athenahealth {

	public static void main(String[] args) {
		
		
		boolean[] slots = new boolean[16];
		
			
		Doctor d = new Doctor("Rathish");
		
		d = new Doctor("Viswa");
		
		
		d = new Doctor("Viswa");
		d = new Doctor("Viswa");
		
		int no = d.getToken();
		
		availableSlots(slots, no);
		
		displayAvailable(slots);
		

		
		//d.displayPatients();
	}
	
	public static void availableSlots(boolean[] b, int no) {
		for(int i=0;i<no;i++) {
			b[i] = true;
		}
	}
	
	public static void displayAvailable(boolean[] b) {
		for(int i=0;i<16;i++) {
			if(b[i] != true) {
				System.out.println("Slot - " + i);
			}
		}
	}

}
