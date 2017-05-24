
public class Player extends Charactor {

	private GameManager GM;
	
	public Player(){
		HP = 10;
		place = 10;
		power = 10;
		System.out.println(HP);
		System.out.println(place);
		System.out.println(power);
	}
	
	public void findEnemy(){
		System.out.println("Map은 저에게 Enemy정보를 주세요");

	}
	@Override
	public void move() {
		super.move();
		Charactor temp = GM.getMap().getEnemy();
		int distance = temp.place - place;
		System.out.println("Enemy와 저의 거리는 " + distance + "입니다");
		if(distance <= 1){
			
		} else {
			System.out.println("공격을 할 수 없으니 1만큼 이동합니다");
			place = place - 1;
			System.out.println("이동이 끝났습니다. GameManager, 저는 턴을 종료할게요");
			GM.getMap().setPlayer(this);
			GM.nextTurn();
		}
	}
	
	
}
