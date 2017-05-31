public class Map {
	
	private int playerPlaceX;
	private int playerPlaceY;
	private int enemyPlaceX;
	private int enemyPlaceY;
	
	public Map(){
		setPlayerPlaceX(5);
		setPlayerPlaceY(5);
		setEnemyPlaceX(-5);
		setEnemyPlaceY(-5);
	}

	public int getPlayerPlaceX() {
		return playerPlaceX;
	}

	public void setPlayerPlaceX(int playerPlaceX) {
		this.playerPlaceX = playerPlaceX;
	}

	public int getEnemyPlaceX() {
		return enemyPlaceX;
	}

	public void setEnemyPlaceX(int enemyPlaceX) {
		this.enemyPlaceX = enemyPlaceX;
	}

	public int getPlayerPlaceY() {
		return playerPlaceY;
	}

	public void setPlayerPlaceY(int playerPlaceY) {
		this.playerPlaceY = playerPlaceY;
	}

	public int getEnemyPlaceY() {
		return enemyPlaceY;
	}

	public void setEnemyPlaceY(int enemyPlaceY) {
		this.enemyPlaceY = enemyPlaceY;
	}

}
