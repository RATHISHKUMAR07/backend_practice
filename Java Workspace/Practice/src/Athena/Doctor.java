package Athena;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Doctor> list = new ArrayList<Doctor>();
	
	String patientName;
	static int tokenNo = 1;
	
	Doctor(String patientName){
		this.patientName = patientName;
		this.tokenNo++;
		
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	
	public int getToken() {
		return tokenNo;
	}
	
	
	public void displayPatients() {
		for(Doctor d : list) {
			System.out.println(d.patientName + " - " + d.tokenNo);
		}
	}
	
	
	
}
