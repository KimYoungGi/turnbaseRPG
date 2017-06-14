
public class GameManager {

	private Player player;
	private Enemy enemy;
	private boolean playerTurn = false;
	
	public GameManager(){
		System.out.println("Player 생성");
		setPlayer(new Player());
		System.out.println("Enemy 생성");
		setEnemy(new Enemy());
		System.out.println("게임시작");
		StartGame();
	}
	
	public void StartGame(){
		checkWinner();
	}
	
	public void checkWinner(){
		while(player.getHP() > 0 || enemy.getHP() > 0){
			if(player.winner == "Player"){
				EndGame(player.winner);
				break;
			} else if(enemy.winner == "Enemy"){
				EndGame(enemy.winner);
				break;
			} else {
				nextTurn();
			}
		}
	}
	
	public void EndGame(String user){
		System.out.println("게임종료");
		System.out.println(user + "의 승리입니다.");
	}
	public void nextTurn(){
		if(playerTurn == true){
			playerTurn = false;
			System.out.println("Enemy 턴 진행");
			enemy.moveEnemy(player);
		} else {
			playerTurn = true;
			System.out.println("Player 턴 진행");
			player.movePlayer(enemy);
		}
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
