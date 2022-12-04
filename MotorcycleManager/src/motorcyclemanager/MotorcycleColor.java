package motorcyclemanager;

public enum MotorcycleColor {
	
	WHITE("White"), 
	BLACK("Black"),
	GREEN("Green"), 
	ORANGE("Orange"), 
	YELLOW("Yellow"), 
	BLUE("Blue");
	
	private String color;
	
	MotorcycleColor(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	} 
}
