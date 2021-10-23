
public class Main {

	public static void main(String[] args) {
		
//		Laptop laptop = new Laptop();
//		System.out.println(laptop.getProcessor().getBrand());
		
		Processor processor = new Processor("Intel", "7200U", 7, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		
		GraphicsCard gpu = new GraphicsCard("Nana", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17f, "DDR4", "2TB", null,"backlit", processor, gpu);
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("Gaming Mode On");

	}

}
