
public class Enemy extends Charactor{
	
	private int enemyPlaceX;
	private int enemyPlaceY;
	
	public Enemy(){
		HP = 30;
		power = 10;
		winner = "None";
		setEnemyPlaceX(34);
		setEnemyPlaceY(56);
	}
	
	public void moveEnemy(Player player){
		double distance = getDistance(player.getPlayerPlaceX(), player.getPlayerPlaceY(), getEnemyPlaceX(), getEnemyPlaceY());
		System.out.println("Player와 저의 거리는 " + distance + "입니다.");
		if(distance <= 1){
			System.out.println("거리가 1보다 작으니 공격을 합니다.");
			attackEnemy(player);
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다.");	
			if(getEnemyPlaceX() > player.getPlayerPlaceX()){
				if(getEnemyPlaceY() > player.getPlayerPlaceY()){
					setEnemyPlaceX(getEnemyPlaceX()-1);
					setEnemyPlaceY(getEnemyPlaceY()-1);
				} else {
					setEnemyPlaceX(getEnemyPlaceX()-1);
					setEnemyPlaceY(getEnemyPlaceY()+1);
				}
			} else {
				if(getEnemyPlaceY() > player.getPlayerPlaceY()){
					setEnemyPlaceX(getEnemyPlaceX()+1);
					setEnemyPlaceY(getEnemyPlaceY()-1);
				} else {
					setEnemyPlaceX(getEnemyPlaceX()+1);
					setEnemyPlaceY(getEnemyPlaceY()+1);
				}
			}
			System.out.println("Enemy 이동이 끝났습니다. 저는 턴을 종료할게요.");
		}
	}
	
	public void attackEnemy(Player player){
		System.out.println("Player에게 " + getPower() + "로 공격합니다.");
		player.hitPlayerDamage(this);
		System.out.println("player의 남은 HP는 " + player.getHP() + "입니다");
		if(player.getHP() <= 0){
			System.out.println("player가 죽었습니다.");
			winner = "Enemy";
		} else {
			System.out.println("player가 죽지 않았기 때문에 저는 턴을 종료합니다.");
		}
	}
	
	public void hitEnemyDamage(Player player){
		System.out.println("으악! 저는 " + player.getPower() + "의 데미지를 입었습니다");
		setHP(getHP() - player.getPower());
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