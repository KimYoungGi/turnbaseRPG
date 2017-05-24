
public class Charactor {
	protected int HP;
	protected int power;
	protected int place;
	private Player p;
	private Enemy e;
	
	public int distance(Charactor A){
		
		return 1;
	}
	
	public void move(){
		System.out.println("Map은 저에게 Enemy 정보를 주세요.");
	}
	
	public int Attack(int hit){
		
		return 1;
	}
	
	public int Damage(int damage){
		
		return 1;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
}
