package chapter9;

public class Lab09_TestAccount {

	public static void main(String[] args) {
		/*Write a test program that creates an Account object with an account ID of 1122,
		a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
		method to withdraw $2,500, use the deposit method to deposit $3,000, and print
		the balance, the monthly interest, and the date when this account was created.*/
		
		//1) create an Account object with an account ID of 1122,
		
		Account myAcc = new Account(1122, 20000);
		
		// 2) an annual interest rate of 4.5%
		myAcc.setAnnualInteresestRate(0.045);
		
		//3) Use the withdrawmethod to withdraw $2,500
		myAcc.withdraw(2500);
		
		//4)use the deposit method to deposit $3,000
		myAcc.deposit(3000);
		
		
		//5) and print the balance
		System.out.println("Balance:              " + myAcc.getBalance());
		
		System.out.println("Monthly interest:     " + myAcc.getMonthlyInteresestRate());
		
		System.out.println("Account Create Date : " + myAcc.getDateCreated());
		

	}

}