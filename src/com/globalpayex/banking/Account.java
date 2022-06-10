package com.globalpayex.banking;

import com.globalpayex.bank.exceptions.MinBalanceCheckException;

public class Account {
	double AccNo;
	double AccBalance;
	String AccType;
	double Withdraw;
	
	public Account(double accNo, double accBalance, String accType,double withdraw) {
		super();
		this.AccNo = accNo;
		this.AccBalance = accBalance;
		this.AccType = accType;
		this.Withdraw= withdraw;
	}
	public double Withdraw(double amount) throws MinBalanceCheckException {
			try {
				if(this.AccBalance - amount < 1000 ) {
					//throw expection to the user
//					throw new IllegalStateException("balance cannot go below 1000");
					throw new  MinBalanceCheckException ("balance cannot go below 1000");
				}
				
				if(amount<0) {
					throw new IllegalArgumentException("Amount Entered is Negative ");
					
				}
				
				this.AccBalance -= amount;
				return this.AccBalance;
			}
			finally {
				System.out.println("transaction ends");
			}

	}
		
		public double Deposit(double amount1){
			AccBalance += amount1;
			
			return AccBalance;
		}
		
		

		
}
