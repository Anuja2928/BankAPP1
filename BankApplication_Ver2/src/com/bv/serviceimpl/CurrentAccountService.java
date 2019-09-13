package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.CurrentAccount;
import com.bv.service.ITransaction;

public class CurrentAccountService implements ITransaction {
	CurrentAccount currentaccount;
	double originalCreditLimit;
	public CurrentAccountService(CurrentAccount currentAccount) {
		super();
		this.currentaccount = currentAccount;
		set();
		
	}

	public void set()
	{
		currentaccount.setAcc_type("current");
		currentaccount.setCreditLimit(50000);
		originalCreditLimit=currentaccount.getCreditLimit();
	}
	
	@Override
	public void withdraw(double amount) {
		double balance=currentaccount.getBalance()-amount;
		double creditLimit=currentaccount.getCreditLimit();
		
		  if (balance >= 0   &&  balance + currentaccount.getCreditLimit()< amount)
		{
			  {
			  System.out.println("Invalid funds");
				System.out.println("the maximum amount you can draw is " +(currentaccount.getBalance()+currentaccount.getCreditLimit()));
				
				
			currentaccount.setBalance(balance);
			System.out.println("Your account XXXXXXX" + currentaccount.getAcc_no() % 10 + " has been debited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
		
			  
		 else
			{currentaccount.setBalance(balance);
			System.out.println("Your account XXXXXXX" + currentaccount.getAcc_no() % 10 + " has been debited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
			}
		}
		else if (balance < 0)
		{
			currentaccount.setBalance(balance);
			currentaccount.setCreditLimit(creditLimit+balance);
			System.out.println("Your account XXXXXXX" + currentaccount.getAcc_no() % 10 + " has been debited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance()+"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
		}
		
			
		else
		{
		System.out.println("Invalid transaction you exceed credit limit");
		}
	}
	
	@Override
	public void deposite(double amount) {
		
		if (currentaccount.getBalance() < 0)
		{
			double bal=currentaccount.getCreditLimit()+amount-originalCreditLimit;
			currentaccount.setCreditLimit(originalCreditLimit);
			currentaccount.setBalance(bal);
			System.out.println("Your account XXXXXXX" + currentaccount.getAcc_no() % 10 + " has been credited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
		}
		else
		{
			currentaccount.setBalance(amount);
			System.out.println("Your account XXXXXXX" + currentaccount.getAcc_no() % 10 + " has been credited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
			
		}
		
	}
	public void chooseOperation() {
		Scanner sc = null;
		int choice;
		boolean flag = true;
		while (flag) {

			System.out.println("\n" + "Select one of the options below");
			System.out.println("1. Withdraw" + "\n" + "2. Deposite" + "\n" + "3. Display Details" + "\n" + "4. Exit"+"\n");
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter amount to be withdraw"+"\n");
				withdraw(sc.nextDouble());
				break;
			}

			case 2: {
				System.out.println("Enter amount to be deposite"+"\n");
				deposite(sc.nextDouble());
				break;
			}
			case 3: {
				System.out.println(currentaccount);
				break;
			}
			case 4: {
				System.out.println("Transaction complete\n");
				flag = false;
				break;
			}
			default: {
				System.out.println("Enter Valid operation"+"\n");
				break;
			}
			}

		}

	}

	
	
}

