package oops.abstractraction;

abstract class Bank{
	int getROI(int cost) {
		return 0;
	}
}
class SBI extends Bank{
	
	int getROI(int cost) {
		return cost * 1;
	}
}
class ICICI extends Bank{
	int getROI(int cost) {
		return cost * 2;
	}
}
class IDFC extends Bank{
	int getROI(int cost) {
		return cost * 3;
	}
}

public class BankClass {

	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println("ICICI ROI - " + b.getROI(10000));
		
		b = new ICICI();
		System.out.println("SBI ROI - " + b.getROI(10000));
		
		b = new IDFC();
		System.out.println("IDFC ROI - " + b.getROI(10000));

	}

}
