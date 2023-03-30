public class Product {
	// Initialize Class Variables
	private int basePrice;
	private int totalCost;
	private String model;
	private int chosenModelCost;
	private int quantity;
	private int priceForAll;
	

	// Constructor: Base Price
	Product(int objBasePrice){
		basePrice = objBasePrice;
	}
	
	
	// Methods: Get & Calculate for Price for more than one product
	// (depends on how many the user wants to buy)
	protected int getPriceForAll() {
		return priceForAll;
	}
	protected void calculatePriceForAll() {
		this.priceForAll = this.getQuantity() * this.getTotalCost();
	}
	
	
	// Methods: Get & Set for User's Chosen Model's Cost
	protected int getChosenModelCost() {
		return this.chosenModelCost;
	}
	protected void setChosenModelCost(int chosenModelCost) {
		this.chosenModelCost = chosenModelCost;
	}
	
	
	// Methods: Get for Object's Base Price
	protected int getObjBasePrice() {
		return this.basePrice;
	}
	
	
	// Methods: Get & Set for Model	
	protected String getModel() {
		return model;
	}
	protected void setModel(String model) {
		this.model = model;
	}


	// Methods: Get & Set for Quantity
	protected int getQuantity() {
		return this.quantity;
	}
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	// Methods: Get & AddTo for TotalCost
	protected int getTotalCost() {
		return totalCost;
	}
	protected void addToTotalCost(int addedCosts) {
		this.totalCost += addedCosts;
	}


	// Method: Get user selection inputs (will be overriden on every object)
	protected void getUserSelection() {

	}

	
	// Method: Calculate total cost (will be overriden on every object)
	protected int calculateCost() {
		// Initiate Base Price
		addToTotalCost(getObjBasePrice());
		
		// Return Total Cost
		return getTotalCost();
	}
}
