public class Macbook extends Product {
	
	Macbook(int objBasePrice) {
		super(objBasePrice);
	}
	
	// Initiate class variables
	public String memory;
	public int chosenMemoryCost;
	public String color;
	public int chosenColorCost;
	public String size;
	public int chosenSizeCost;
	
	
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
	
	// Methods: Get & Set for Chosen Size Cost
	protected int getChosenSizeCost() {
		return chosenSizeCost;
	}
	protected void setChosenSizeCost(int chosenSizeCost) {
		this.chosenSizeCost = chosenSizeCost;
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
	
	// Methods: Get & Set for Size
	protected String getSize() {
		return size;
	}
	protected void setSize(String size) {
		this.size = size;
	}


	// Methods: Get all user inputs for MacBook Additions
	// Also, everything will be lower cased so it's easy to check
	// for if statements later (no matter what the user inputs)
	public void getUserSelection(String model, String size, 
			String color, String memory, int quantity) {
		setModel(model.toLowerCase());
		setSize(size.toLowerCase());
		setColor(color.toLowerCase());
		setMemory(memory.toLowerCase());
		setQuantity(quantity);
	}
	
	
	// Method: Calculate Total Cost for user's preferences
	public int calculateCost() {
		// Initiate Base Price
		addToTotalCost(getObjBasePrice());
		
		// Additional costs for MacBook's Model
		if(getModel().equals("air")) {
			setChosenModelCost(0);
		} else if(getModel().equals("pro")) {
			addToTotalCost(200);
			setChosenModelCost(200);
		} else {
			throw new IllegalArgumentException("Invalid Input.");
		}
		
		// Additional costs for MacBook's Size
		if(getSize().equals("13inch")) {
			setChosenSizeCost(0);
		} else if(getSize().equals("14inch")) {
			addToTotalCost(100);
			setChosenSizeCost(100);
		} else if(getSize().equals("16inch")) {
			addToTotalCost(200);
			setChosenSizeCost(200);
		} else {
			throw new IllegalArgumentException("Invalid Input.");
		}
		
		// Additional costs for MacBook's Color
		if(getColor().equals("base")) {
			setChosenColorCost(0);
		} else if(getColor().equals("gold")) {
			addToTotalCost(20);
			setChosenColorCost(20);
		} else if(getColor().equals("silver")) {
			addToTotalCost(10);
			setChosenColorCost(10);
		} else {
			throw new IllegalArgumentException("Invalid Input.");
		}
		
		// Additional costs for MacBook's Memory
		if(getMemory().equals("128")) {
			setChosenMemoryCost(0);
		} else if(getMemory().equals("256")) {
			addToTotalCost(100);
			setChosenMemoryCost(100);
		} else if(getMemory().equals("512")) {
			addToTotalCost(300);
			setChosenMemoryCost(300);
		} else {
			throw new IllegalArgumentException("Invalid Input.");
		}
		
		// Calculate price for MacBook Chosen Preferences * User's Chosen Quantity
		calculatePriceForAll();
		
		// Later on, return the total cost of the object
		return getTotalCost();
	}
	
	
	// Print out all the additional costs
	protected void printAllAdditionalCosts() {
		System.out.printf("Base price of Macbook ---- $%d\n", this.getObjBasePrice());
		System.out.println("Here are your additional costs: ");
		System.out.printf("Model (%s) ----- +$%d\n",
		this.getModel(), this.getChosenModelCost());
		System.out.printf("Size (%s) ----- +$%d\n",
		this.getSize(), this.getChosenSizeCost());
		System.out.printf("Color (%s) ----- +$%d\n", 
		this.getColor(), this.getChosenColorCost());
		System.out.printf("Memory (%s) ----- +$%d\n",
		this.getMemory(), this.getChosenMemoryCost());
	}
}














