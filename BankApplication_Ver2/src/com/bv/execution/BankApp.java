package com.bv.execution;

import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;
import com.bv.serviceimpl.AccountService;
import com.bv.serviceimpl.CurrentAccountsRepository;
import com.bv.serviceimpl.SavingAccountsRepository;

public class BankApp {

	public static void main(String[] args) {
		
		
		/*Account salAccount = new SavingAccount(102, "SalaryAccountHolder", 4000, true);
		Account savingAccount1 = new SavingAccount(101, "Parvati", 5000,false);
		
		SavingAccountService salaryAccountService = new SavingAccountService((SavingAccount) salAccount);
		salaryAccountService.chooseOperation();
		
		System.out.println("-------------------------------");
		
		SavingAccountService savingAccountService = new SavingAccountService((SavingAccount)savingAccount1);
		savingAccountService.chooseOperation();
		
		CurrentAccount currentAccount=new CurrentAccount(102, "SalaryAccountHolder", 4000);
		CurrentAccountService currentAccountService=new CurrentAccountService(currentAccount);
		currentAccountService.withdraw(20000);
		currentAccountService.deposite(30000);
		*/
		
//		System.out.println(savingRepo.getAllAccounts());
//		System.out.println(savingRepo.getAccount(101));
//		SavingAccount savingAccount = new SavingAccount(103, "Kajal", 10000, true);
//		System.out.println(savingRepo.addAccount(savingAccount));
//		System.out.println(savingRepo.getAllAccounts());
//		System.out.println(savingRepo.removeAccount(102));
//		System.out.println("After Deletion");
//		System.out.println(savingRepo.getAllAccounts());
		
		SavingAccountsRepository savingRepo = new SavingAccountsRepository();
		AccountService accountService = new AccountService();

		System.out.println(savingRepo.getAllAccounts());
	    
		SavingAccount savingAccount = new SavingAccount(103, "Kajal", 10000, true);
		System.out.println(savingRepo.addAccount(savingAccount));
		System.out.println(savingRepo.getAllAccounts());
		System.out.println(savingRepo.removeAccount(102));
		System.out.println("After Deletion");
		System.out.println(savingRepo.getAllAccounts());
		
		
		CurrentAccountsRepository currentrepo = new CurrentAccountsRepository();
		
		
		AccountService accountService1 = new AccountService();
		accountService1.chooseOperation();
		accountService.chooseOperation();

		System.out.println(currentrepo.getAllAccounts());
	    
		CurrentAccount currentAccount = new CurrentAccount(104, "omkar", 1000);
		System.out.println(currentrepo.addAccount(currentAccount));
		System.out.println(currentrepo.getAllAccounts());
		System.out.println(currentrepo.removeAccount(102));
		System.out.println("After Deletion");
		System.out.println(currentrepo.getAllAccounts());
		
	}

}
