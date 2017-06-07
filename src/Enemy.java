
public class Enemy extends Charactor{
	
	private int enemyPlaceX;
	private int enemyPlaceY;
	
	public Enemy(){
		HP = 30;
		place = 5;
		power = 5;
		setEnemyPlaceX(15);
		setEnemyPlaceY(15);
		System.out.println(HP);
		System.out.println(place);
		System.out.println(power);
	}

	public int getEnemyPlaceY() {
		return enemyPlaceY;
	}

	public void setEnemyPlaceY(int enemyPlaceY) {
		this.enemyPlaceY = enemyPlaceY;
	}

	public int getEnemyPlaceX() {
		return enemyPlaceX;
	}

	public void setEnemyPlaceX(int enemyPlaceX) {
		this.enemyPlaceX = enemyPlaceX;
	}
	
	
}
