
public class Laptop {
	
	private float screen;
	private String ram;
	private String hardDrive;
	private String opticalDrive;
	private String keyboard;
//	コンポジションは、あるclassの機能を持つclassを指す。
//	他のclassの機能を、自分が作るclassにも持たせたい場合に、継承を使わずフィールドとしてそのclassを持ち、
//	そのclassのメソッドを呼び出すメソッドを持たせること。そうすることで、classに他のclassの機能を組み込むことができる。
//	継承は、packageが違う時などに使用。is-aの関係。
	private Processor processor;
	private GraphicsCard graphicsCard;
	
	
	public Laptop() {
		this.screen = 15.6f;
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.opticalDrive = "MLT Layer";
		this.keyboard = "Backlit";
		this.processor = new Processor();
		this.graphicsCard = new GraphicsCard();
		
	}


	public Laptop(float screen, String ram, String hardDrive, String opticalDrive, String keyboard, Processor processor,
			GraphicsCard graphicsCard) {
		super();
		this.screen = screen;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
		this.processor = processor;
		this.graphicsCard = graphicsCard;
	}


	public float getScreen() {
		return screen;
	}


	public String getRam() {
		return ram;
	}


	public String getHardDrive() {
		return hardDrive;
	}


	public String getOpticalDrive() {
		return opticalDrive;
	}


	public String getKeyboard() {
		return keyboard;
	}


	public Processor getProcessor() {
		return processor;
	}


	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "Success!";
	}


	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", opticalDrive="
				+ opticalDrive + ", keyboard=" + keyboard + ", processor=" + processor + ", graphicsCard="
				+ graphicsCard + "]";
	}
	
}
