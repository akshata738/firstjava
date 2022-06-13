package com.globalpayex.banking;

import java.util.Optional;

import com.globalpayex.bank.exceptions.MinBalanceCheckException;

public class CreateAccount {
	public static void main(String[] args) {
		Account b = new Account ("",0,"",0);
		Account a=new Account("523641",5000,"Savings",2000);
		System.out.println(a.Deposit(2000));
		
		
		try {
			
			System.out.println(a.Withdraw(-4000));
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(a.Withdraw(-1000));
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (MinBalanceCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			a.Withdraw(1000);
		} catch (MinBalanceCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
//		Account emptyAccount = new Account("5623",85,"7856",63);
		Account emptyAccount = new Account("null",0,"null",0);
		Optional<String> optional = emptyAccount.getDetails();
		if(optional.isPresent()) {
			System.out.println(optional.get().toUpperCase());
			
		}
		emptyAccount.getDetails().ifPresentOrElse(o ->System.out.println(o.toUpperCase()),
		() -> System.out.println("null")) ;
//		emptyAccount.setAcctype("syx");
		emptyAccount.setAcctype("Savings");
		emptyAccount.setAccBalance(5500);
		
		System.out.println(emptyAccount.getAcctype());
		System.out.println(emptyAccount.getAccBalance());
		
		
		
		
		
	}
	

}
