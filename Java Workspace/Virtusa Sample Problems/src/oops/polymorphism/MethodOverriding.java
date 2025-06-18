package oops.polymorphism;

class Bank{
	float getROI(float cost) {
		return 0;
	}
}
class ICICI extends Bank{
	float getROI(float cost) {
		return cost * 0.7f;
	}
}
class SBI extends Bank{
	float getROI(float cost) {
		return cost * 0.8f;
	}
}
class IDFC extends Bank{
	float getROI(float cost) {
		return cost * 0.9f;
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Bank b = new ICICI();
		System.out.println("ICICI ROI - " + b.getROI(10000f));
		
		b = new SBI();
		System.out.println("SBI ROI - " + b.getROI(10000f));
		
		b = new IDFC();
		System.out.println("IDFC ROI - " + b.getROI(10000f));
	}

}
