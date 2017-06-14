
public class Player extends Charactor {

	private int playerPlaceX;
	private int playerPlaceY;
	
	public Player(){
		HP = 20;
		power = 10;
		winner = "None";
		setPlayerPlaceX(-20);
		setPlayerPlaceY(-77);
	}
	
	public void movePlayer(Enemy enemy){
		double distance = getDistance(getPlayerPlaceX(), getPlayerPlaceY(), enemy.getEnemyPlaceX(), enemy.getEnemyPlaceY());
		System.out.println("Enemy와 저의 거리는 " + distance + "입니다.");
		if(distance <= 1){
			System.out.println("거리가 1보다 작으니 공격을 합니다.");
			attackPlayer(enemy);
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다.");
			if(getPlayerPlaceX() > enemy.getEnemyPlaceX()){
				if(getPlayerPlaceY() > enemy.getEnemyPlaceY()){
					setPlayerPlaceX(getPlayerPlaceX()-1);
					setPlayerPlaceY(getPlayerPlaceY()-1);
				} else {
					setPlayerPlaceX(getPlayerPlaceX()-1);
					setPlayerPlaceY(getPlayerPlaceY()+1);
				}
			} else {
				if(getPlayerPlaceY() > enemy.getEnemyPlaceY()){
					setPlayerPlaceX(getPlayerPlaceX()+1);
					setPlayerPlaceY(getPlayerPlaceY()-1);
				} else {
					setPlayerPlaceX(getPlayerPlaceX()+1);
					setPlayerPlaceY(getPlayerPlaceY()+1);
				}
			}
			System.out.println("Player 이동이 끝났습니다. 턴을 종료할게요.");
		}
	}
	
	public void attackPlayer(Enemy enemy){
		System.out.println("enemy에게 " + getPower() + "로 공격합니다.");
		enemy.hitEnemyDamage(this);
		System.out.println("enemy의 남은 HP는 " + enemy.getHP() + "입니다");
		if(enemy.getHP() <= 0){
			System.out.println("enemy가 죽었습니다.");
			winner = "Player";
		} else {
			System.out.println("enemy가 죽지 않았기 때문에 저는 턴을 종료합니다.");
		}
	}
	
	public void hitPlayerDamage(Enemy enemy){
		System.out.println("으악! 저는 " + enemy.getPower() + "의 데미지를 입었습니다");
		setHP(getHP() - enemy.getPower());
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