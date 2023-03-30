public class Iphone extends Product {

	Iphone(int objBasePrice){
		super(objBasePrice);
	}
	
	// Initiate class variables
	public String memory;
	public int chosenMemoryCost;
	public String color;
	public int chosenColorCost;
	
	// Methods: Get & Set for Chosen Memory Cost
	protected int getChosenMemoryCost() {
		return chosenMemoryCost;
	}
	protected void setChosenMemoryCost(int chosenMemoryCost) {
		this.chosenMemoryCost = chosenMemoryCost;
	}
	
	// Methods: Get & Set for Chosen Color Cost
	protected int getChosenColorCost() {
		return chosenColorCost;
	}
	protected void setChosenColorCost(int chosenColorCost) {
		this.chosenColorCost = chosenColorCost;
	}
	
	// Methods: Get & Set for Memory
	protected String getMemory() {
		return memory;
	}
	protected void setMemory(String memory) {
		this.memory = memory;
	}

	// Methods: Get & Set for Color
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	
	
	// Methods: Get all user inputs for iPhone Additions
	// Also, everything will be lower cased so it's easy to check
	// for if statements later (no matter what the user inputs)
	public void getUserSelection(String model, 
			String color, String memory, int quantity) {
		setModel(model.toLowerCase());
		setColor(color.toLowerCase());
		setMemory(memory.toLowerCase());
		setQuantity(quantity);
	}
	
	
	// Method: Calculate Total Cost for user's preferences
	public int calculateCost() {
		// Initiate Base Price
		addToTotalCost(getObjBasePrice());
		
		// Additional costs for iPhone's Model
		if(getModel().equals("iphone12")) {
			setChosenModelCost(0);
		} else if(getModel().equals("iphone13")) {
			addToTotalCost(200);
			setChosenModelCost(200);
		} else {
			throw new IllegalArgumentException("Invalid Input.");
		}
		
		// Additional costs for iPhone's Color
		if(getColor().equals("base")) {
			setChosenColorCost(0);
		} else if(getColor().equals("gold")) {
			addToTotalCost(20);
			setChosenColorCost(20);
		} else if(getColor().equals("silver")) {
			addToTotalCost(10);
			setChosenColorCost(10);
		}
		
		// Additional costs for iPhone's Memory
		if(getMemory().equals("64")) {
			setChosenMemoryCost(0);
		} else if(getMemory().equals("128")) {
			addToTotalCost(100);
			setChosenMemoryCost(100);
		} else if(getMemory().equals("256")) {
			addToTotalCost(200);
			setChosenMemoryCost(200);
		} else if(getMemory().equals("512")) {
			addToTotalCost(300);
			setChosenMemoryCost(300);
		}
		
		// Calculate price for Iphone's Chosen Preferences * User's Chosen Quantity
		calculatePriceForAll();
		
		// Later on, return the total cost of the object
		return getTotalCost();
	}
	
	// Print out all the additional costs
	protected void printAllAdditionalCosts() {
		System.out.printf("Base price of iPhone ---- $%d\n", this.getObjBasePrice());
		System.out.println("Here are your additional costs: ");
		System.out.printf("Model (%s) ----- +$%d\n",
		this.getModel(), this.getChosenModelCost());
		System.out.printf("Color (%s) ----- +$%d\n", 
		this.getColor(), this.getChosenColorCost());
		System.out.printf("Memory (%s) ----- +$%d\n",
		this.getMemory(), this.getChosenMemoryCost());
	}
}






