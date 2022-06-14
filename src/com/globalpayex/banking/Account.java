package com.globalpayex.banking;

import java.util.Optional;

import com.globalpayex.bank.exceptions.MinBalanceCheckException;

public class Account {
	//all instances for getter and setter must be public
	//all instances attribute must be declared as private
	public String AccNo;
	public double AccBalance;
	public String AccType;
	public double Withdraw;
	
	public Account(String accNo, double accBalance, String accType,double withdraw) {
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
		//null pointer exxception
		public Optional<String> getDetails() {
			if(this.AccNo != null && !this.AccNo.equals("") && this.AccType!= null && !this.AccType.equals(""))
			{
				return Optional.of(String.format("Accno:%s\n AccType:%s\n " , this.AccNo,this.AccType));
			}
			return Optional.empty();
			
		}
		//setter method
		public void setAcctype(String accType) {
			if(accType.equals("Savings") ||accType.equals("Current")) {
				this.AccType=accType;
				} else {
					throw new IllegalArgumentException("Account type must of the following: Savings/Current");
					
				}
			
		}
		//getter method
		public String getAcctype() {
			return this.AccType.toUpperCase();
			
		}

		public double getAccBalance() {
			return this.AccBalance;
		}

		public double setAccBalance(double AccBalance) {
			if(this.AccBalance < 1000){
				throw new IllegalArgumentException("Balance should not be below 1000");
			}
			return this.AccBalance=AccBalance;
			
//			AccBalance = accBalance;
		}
//		public static hasinterest() {
//			
//		}
//		
		
		

		
}
