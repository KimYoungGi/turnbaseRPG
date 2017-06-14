
public class Director {
	
	private static GameManager GM;
	
	public static void main(String[] args){
		System.out.println("GameManager 생성");
		setGM(new GameManager());
	}

	public static GameManager getGM() {
		return GM;
	}

	public static void setGM(GameManager gM) {
		GM = gM;
	}
}