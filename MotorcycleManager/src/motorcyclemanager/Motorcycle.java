package motorcyclemanager;

import java.util.Objects;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	MotorcycleColor color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	
	
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = MotorcycleColor.valueOf(color.toUpperCase().replace(" ", ""));
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}
	
	public void repair(){
		isReadyToDrive = true;
	}
	

	public void destroyEngine() {
		if(distance >= 200000) {
			isReadyToDrive = false;
		}
	}
	
	public void changeColor(String newColor) {
		color = MotorcycleColor.valueOf(newColor);
	}

	public MotorcycleColor getColor() {
		return color;
	}

	public void addDistance(int additionalDistance) {
		if(additionalDistance < 0) {
			distance = distance + 0;
		} else { 
			distance += additionalDistance;
		}
	}
	
	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color.getColor() + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, distance, isReadyToDrive);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && distance == other.distance && isReadyToDrive == other.isReadyToDrive;
	}
	
	
	
}
