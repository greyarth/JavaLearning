package motorcyclemanager;

public class MotorcycleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE ", "gas", false);
		
		suzuki.addDistance(250000);
		yamaha.addDistance(250000);
		
		suzuki.destroyEngine();
		yamaha.destroyEngine();
		
		suzuki.repair();
		yamaha.repair();
		
		yamaha.changeColor("BLACk");
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		System.out.println(suzuki.equals(yamaha));

	}

}
