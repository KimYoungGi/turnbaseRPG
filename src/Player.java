
public class Player extends Charactor {

	private int playerPlaceX;
	private int playerPlaceY;
	
	public Player(){
		HP = 10;
		place = 10;
		power = 10;
		setPlayerPlaceX(5);
		setPlayerPlaceY(5);
		System.out.println(HP);
		System.out.println(place);
		System.out.println(power);
	}

	public int getPlayerPlaceX() {
		return playerPlaceX;
	}

	public void setPlayerPlaceX(int playerPlaceX) {
		this.playerPlaceX = playerPlaceX;
	}

	public int getPlayerPlaceY() {
		return playerPlaceY;
	}

	public void setPlayerPlaceY(int playerPlaceY) {
		this.playerPlaceY = playerPlaceY;
	}
	
}
