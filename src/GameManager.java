
public class GameManager {

	private Map map;
	private Player player;
	private Enemy enemy;
	private boolean playerTurn = true;
	
	public GameManager(){
		System.out.println("Map 생성");
		setMap(new Map());
		System.out.println("Player 생성");
		setPlayer(new Player());
		System.out.println("Enemy 생성");
		setEnemy(new Enemy());
		System.out.println("게임시작");
		StartGame();
	}
	
	public void StartGame(){
		movePlayer();
	}
	
	public double getDistance(int x, int y, int x1, int y1){
		return Math.sqrt(Math.pow(Math.abs(x1-x), 2) + Math.pow(Math.abs(y1-y), 2));
	}
	
	public void attackPlayer(){
		System.out.println("enemy에게 " + player.getPower() + "로 공격합니다.");
		System.out.println("으악! 저는 " + player.getPower() + "의 데미지를 입었습니다");
		int remainHP = enemy.getHP() - player.getPower();
		System.out.println("enemy의 남은 HP는 " + remainHP + "입니다");
		if(remainHP <= 0){
			System.out.println("enemy가 죽었습니다.");
			EndGame("Player");
		} else {
			System.out.println("enemy가 죽지 않았기 때문에 저는 턴을 종료합니다.");
			enemy.setHP(remainHP);
			nextTurn();
		}
	}
	
	public void attackEnemy(){
		System.out.println("Player에게 " + enemy.getPower() + "로 공격합니다.");
		System.out.println("으악! 저는 " + enemy.getPower() + "의 데미지를 입었습니다");
		int remainHP = player.getHP() - enemy.getPower();
		System.out.println("player의 남은 HP는 " + remainHP + "입니다");
		if(remainHP <= 0){
			System.out.println("player가 죽었습니다.");
			EndGame("Enemy");
		} else {
			System.out.println("player가 죽지 않았기 때문에 저는 턴을 종료합니다.");
			player.setHP(remainHP);
			nextTurn();
		}
	}
	
	public void movePlayer(){
		double distance = getDistance(player.getPlayerPlaceX(), player.getPlayerPlaceY(), enemy.getEnemyPlaceX(), enemy.getEnemyPlaceY());
		System.out.println("Enemy와 저의 거리는 " + distance + "입니다.");
		if(distance <= 1){
			System.out.println("거리가 1보다 작으니 공격을 합니다.");
			attackPlayer();
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다.");			
			player.setPlayerPlaceX(player.getPlayerPlaceX()+1);
			player.setPlayerPlaceY(player.getPlayerPlaceY()+1);
			System.out.println("Player 이동이 끝났습니다. 턴을 종료할게요.");
			nextTurn();
		}
	}
	

	public void moveEnemy(){
		double distance = getDistance(player.getPlayerPlaceX(), player.getPlayerPlaceY(), enemy.getEnemyPlaceX(), enemy.getEnemyPlaceY());
		System.out.println("Player와 저의 거리는 " + distance + "입니다.");
		if(distance <= 1){
			System.out.println("거리가 1보다 작으니 공격을 합니다.");
			attackEnemy();
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다.");			
			enemy.setEnemyPlaceX(enemy.getEnemyPlaceX()-1);
			enemy.setEnemyPlaceY(enemy.getEnemyPlaceY()-1);
			System.out.println("Enemy 이동이 끝났습니다. 저는 턴을 종료할게요.");
			nextTurn();
		}
	}
	
	public void EndGame(String user){
		System.out.println("게임종료");
		System.out.println(user + "의 승리입니다.");
	}
	public void nextTurn(){
		if(playerTurn == true){
			playerTurn = false;
			moveEnemy();
		} else {
			playerTurn = true;
			movePlayer();
		}
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Charactor getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Charactor getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

}