package homework_java;

public class Hmrk3_TestStock {

	public static void main(String[] args) {
		
		System.out.println("Homework 3 Stock class finished by Jean Oussou");
		// Create a stock
		Stock myStock = new Stock ("ORCL", "Oracle Corporation");
		
		myStock.setPreviousClosingPrice(34.5);
		
		myStock.setCurrentPrice(31.35);
		
		System.out.println(myStock);
		
		
		
        Stock yourStock = new Stock ("AAPL", "Apple Inc");
		
        yourStock.setPreviousClosingPrice(259);
		
        yourStock.setCurrentPrice(302);
		
		System.out.println(yourStock);

	}

}
