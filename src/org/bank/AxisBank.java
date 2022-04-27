package org.bank;

public class AxisBank extends BankInfo{
	private void loans() {
		System.out.println("Loan interst Rate is 8%");

	}
	public void deposit() {
		System.out.println("Deposit rate as per our bank is 7%");
		
	}
	public void fixed() {
		super.fixed();
	}
	public void savings() {
		super.savings();
	}
public static void main(String[] args) {
	AxisBank A=new AxisBank();
	A.savings();
	A.loans();
	A.fixed();
	A.deposit();
}
}
	