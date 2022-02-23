/*******************************/
/*Students numbers: 
/*Students full names: 
/*******************************/

// Class Item with
// label, quantity and price as attributes
class Item {
  
    private String label;
    private int quantity;
	private float price;	
  
    // Item class constructor
    Item(String label, int quantity, float price)
    {
        this.label = label;
		this.quantity = quantity;
		this.price = price;
	}
    // display() method to display Item information
    public String toString()
    {
        return(this.label + " - " + this.quantity+ " - " + this.price);
    } 
    
    
    public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	/**
     * this method checks if two items are equal based on their label
     */
    public boolean equals(Object other){
		boolean b = false;
		Item otherItem = (Item) other;
		
		if (other == null) 
		{
			return false;
		}
		
		if(getClass() != other.getClass())
		{
			return false;
		}
		
		

		if (this.label.equals(otherItem.label) ){
			b = true;
		}
		return b;
	}

	
	
}