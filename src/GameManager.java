
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
	
	public void movePlayer(){
		double distance = getDistance(map.getPlayerPlaceX(), map.getPlayerPlaceY(), map.getEnemyPlaceX(), map.getEnemyPlaceY());
		System.out.println("Enemy와 저의 거리는 " + distance + "입니다.");
		if(distance <= 1){
			
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다.");			
			map.setPlayerPlaceX(map.getPlayerPlaceX()-1);
			map.setPlayerPlaceY(map.getPlayerPlaceY()-1);
			System.out.println("Player 이동이 끝났습니다. 턴을 종료할게요.");
			nextTurn();
		}
	}
	

	public void moveEnemy(){
		double distance = getDistance(map.getPlayerPlaceX(), map.getPlayerPlaceY(), map.getEnemyPlaceX(), map.getEnemyPlaceY());
		System.out.println("Player와 저의 거리는 " + distance + "입니다.");
		if(distance <= 1){
			
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다.");			
			map.setEnemyPlaceX(map.getEnemyPlaceX()+1);
			map.setEnemyPlaceY(map.getEnemyPlaceY()+1);
			System.out.println("Enemy 이동이 끝났습니다. 저는 턴을 종료할게요.");
			nextTurn();
		}
	}
	
	public void EndGame(){
		
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