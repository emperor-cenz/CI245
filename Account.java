package chapter9;

import java.util.Date;

public class Account {
	
	//Data Fields
	private int id;
	private double balance; 
	private double annualInteresestRate;
	private Date dateCreated;

	
	
	//Methods
	
	//Custructors methods
	
	public Account(){
		id = 0 ;
		balance = 0;
		annualInteresestRate = 0;
		Date currentDate = new Date();
		dateCreated = currentDate;
	}
	
	
	public Account(int newId, double newbalance){
		id = newId ;
		balance = newbalance;
		Date currentDate = new Date();
		dateCreated = currentDate;

	}
	
	
	//Accessors methods

	public int getId(){
		return id;
	} 
	public double getBalance() {
		return balance;
	} 
	public double getAnnualInteresestRate(){
		return annualInteresestRate;
	} 
	public Date getDateCreated( ) {
		return dateCreated;
	}
	
	
	
	//Mutators methods
	
	public void setID(int newID) {
		
		id = newID;
	}
	
	public void setBalance ( double newBalance  ) {
		balance = newBalance ;
	}
	
	
	public void setAnnualInteresestRate(double newRate ){
		annualInteresestRate = newRate ;
	}
	
	

	
	//regulars methods
	public double getMonthlyInteresestRate(){
		
		return annualInteresestRate/12;
	}
	
	
	public double getMonthlyInteresest(){
		
		return balance * (annualInteresestRate/12);
		
	}
	
	
	public void withdraw(double amount ) {
		
		balance -= amount; 
		
	}
	
	
	public void deposit(double amount ) {
		
		balance += amount;
	} 
	
	//public String toString() {}
	
}