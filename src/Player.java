
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
		System.out.println("Map�� ������ Enemy������ �ּ���");

	}
	@Override
	public void move() {
		super.move();
		Charactor temp = GM.getMap().getEnemy();
		int distance = temp.place - place;
		System.out.println("Enemy�� ���� �Ÿ��� " + distance + "�Դϴ�");
		if(distance <= 1){
			
		} else {
			System.out.println("������ �� �� ������ 1��ŭ �̵��մϴ�");
			place = place - 1;
			System.out.println("�̵��� �������ϴ�. GameManager, ���� ���� �����ҰԿ�");
			GM.getMap().setPlayer(this);
			GM.nextTurn();
		}
	}
	
	
}
