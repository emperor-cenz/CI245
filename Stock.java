package homework_java;

public class Stock {
	//Data Field
	
	
		private String symbol; 
		private String name ;
		private double previousClosingPrice; 
		private double currentPrice ;

		
		
		//Methods
		
		public Stock (String newSymbo , String newName){
			symbol = newSymbo;
			name = newName;
		}
		
		
		
		/*
		 *Accessors  
		 * + getChangePercent( ) : double
	+ getSymbol ( ) : string
	+ getName ( ) :  string
	+ getPreviousClosingPrice ( ): double
	+ getCurrentPrice( ) : double

	//Mutators 
	+ setPreviousClosingPrice (newprice : double) : void
	+ setCurrentPrice ( newPrice: double ) : void
	+ toString() : String

		 * 
		 * */ 
		//all accessors 
		public String getSymbol( ){
			return symbol;
		}
		
		
		public String getName( ){
			return name;
		}
		
		
		public double getPreviousClosingPrice( ){
			return previousClosingPrice;
		}
		
		public double getCurrentPrice( ){
			return currentPrice;
		}
		
		//Mutators
		public void setPreviousClosingPrice(double newprice){
			previousClosingPrice = newprice;
		}
		
		public void setCurrentPrice(double newprice){
			currentPrice = newprice;
		}
		
		
		//Regulars methods
		public double getChangePercent(){
			return (currentPrice - previousClosingPrice)/previousClosingPrice;
		}
		
		//To string
		public String toString() {
			return "The object:  " + 
					"\nCompany Name:        " + name +
					"\nStock Symbol:       " +symbol+
					"\nCurrent Price:     $" +currentPrice+
					//"\nPercentage Change:  " + getChangePercent() + 
					"\nPercentage Change:  " +((int) (getChangePercent()*10000 ) ) /100.0  + "%";
		}

}
