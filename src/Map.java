
public class Map {

	private Charactor player;
	private Charactor enemy;
	
	public Map(){
		System.out.println("Player持失");
		setPlayer(new Player());
		System.out.println("Enemy持失");
		setEnemy(new Enemy());
	}

	public Charactor getEnemy() {
		return enemy;
	}

	public void setEnemy(Charactor enemy) {
		this.enemy = enemy;
	}
	
	public Charactor getPlayer() {
		return player;
	}

	public void setPlayer(Charactor player) {
		this.player = player;
	}

}
