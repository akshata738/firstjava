package com.globalpayex.banking;

import com.globalpayex.bank.exceptions.MinBalanceCheckException;

public class CreateAccount {
	public static void main(String[] args) {
		Account a=new Account(523641,2000,"Savings",2000);
		System.out.println(a.deposit(2000));
		System.out.println(a.Withdraw(-4000));
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
		}
		try {
			a.Withdraw(1000);
		} catch (MinBalanceCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
