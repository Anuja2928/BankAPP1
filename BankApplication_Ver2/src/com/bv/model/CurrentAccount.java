package com.bv.model;

public class CurrentAccount extends Account
{
	public double CreditLimit ;
	public double rem;

	

	public void setCreditLimit(double creditLimit) {
		CreditLimit = creditLimit;
	}

	public double getCreditLimit() {
		return CreditLimit;
	}

	public CurrentAccount(int acc_no, String holder_name, double balance) {
		super(acc_no, holder_name, balance);
		
		
	}
	
	
}
