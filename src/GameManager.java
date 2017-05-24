
public class GameManager {

	private Map map;
	
	public GameManager(){
		System.out.println("Map 생성");
		System.out.println("Map은 Player와 Enemy를 생성하세요.");
		setMap(new Map());
		System.out.println("게임시작");
		System.out.println("Map은 Player가 진행하게 해주세요");
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
