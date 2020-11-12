package practicalexercisep1;

public class Calculate {
	int quantity;
	double  pricebook;
	

	public Calculate(int quantity, double pricebook) {
		super();
		this.quantity = quantity;
		this.pricebook = pricebook;
	}


	public Calculate() {
		// TODO Auto-generated constructor stub
	}


	public  static void CalculateTotalPrice ( int quantity , double  pricebook )
	{
		double totalprice= quantity * pricebook;
		 System.out.println("the total price is");
	}

	
	
}
