package com.bv.service;

import com.Exception.InsufficientBalance;

public interface ITransaction {

	public void withdraw(double amount) throws InsufficientBalance;
	public void deposite(double amount);
	
}
