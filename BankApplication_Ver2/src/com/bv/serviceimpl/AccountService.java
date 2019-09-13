package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.Account;

public class AccountService {


	SavingAccountService savingAccountService;
	CurrentAccountService currentAccountService;
	Account account;
	
	
	
	
	

  public void chooseOperation()
	{
		Scanner sc = null;
		int choice;
		boolean flag = true;
		while (flag) {
			

			System.out.println("\n" + "Select one of the options below");
			System.out.println("1. Saving" + "\n" + "2. Current" + "\n" +"3. Exit");
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
			System.out.println("Saving Account Selected");
			System.out.println("enter account number");
			int accno = sc.nextInt();
			SavingAccountsRepository savingRepo = new SavingAccountsRepository();
			savingRepo.getAccount(accno);
			savingAccountService.chooseOperation();
			break;
		}
		case 2:
		{
			System.out.println("Current Account Selected");
			System.out.println("enter account number");
			int accno1 = sc.nextInt();
			CurrentAccountsRepository currentrepo = new CurrentAccountsRepository();
			currentrepo.getAccount(accno1);
			currentAccountService.chooseOperation();
			break;
		}
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}
}
}

