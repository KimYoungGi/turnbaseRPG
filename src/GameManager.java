
public class GameManager {

	private Map map;
	
	public GameManager(){
		System.out.println("Map ����");
		System.out.println("Map�� Player�� Enemy�� �����ϼ���.");
		setMap(new Map());
		System.out.println("���ӽ���");
		System.out.println("Map�� Player�� �����ϰ� ���ּ���");
		StartGame();
	}
	
	public void StartGame(){
		map.getPlayer().move();
	}
	
	public void EndGame(){
		
	}
	
	public void nextTurn(){
		
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

}
