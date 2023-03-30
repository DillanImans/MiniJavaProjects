public class Airpods extends Product {

	Airpods(int objBasePrice){
		super(objBasePrice);
	}
	
	// Methods: Get all user inputs for AirPods Additions
	// Also, everything will be lower cased so it's easy to check
	// for if statements later (no matter what the user inputs)
	public void getUserSelection(String model, int quantity) {
		setModel(model.toLowerCase());
		setQuantity(quantity);
	}
	
	
	// Method: Calculate Total Cost for user's preferences
	public int calculateCost() {
		// Initiate Base Price
		addToTotalCost(getObjBasePrice());
		
		// Additional costs for AirPods's Model
		if(getModel().equals("airpods3")) {
			setChosenModelCost(0);
		} else if(getModel().equals("airpodspro")) {
			addToTotalCost(100);
			setChosenModelCost(100);
		} else if(getModel().equals("airpodsmax")) {
			addToTotalCost(200);
			setChosenModelCost(200);
		} else {
			throw new IllegalArgumentException("Invalid Input.");
		}
		
		// Calculate price for AirPods Chosen Preferences * User's Chosen Quantity
		calculatePriceForAll();
		
		// Later on, return the total cost of the object
		return getTotalCost();
	}
	
	// Print out all the additional costs
	protected void printAllAdditionalCosts() {
		System.out.printf("Base price of Airpods ---- $%d\n", this.getObjBasePrice());
		System.out.println("Here are your additional costs: ");
		System.out.printf("Model (%s) ----- +$%d\n",
		this.getModel(), this.getChosenModelCost());
	}
}
