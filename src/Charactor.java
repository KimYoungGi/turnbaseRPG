
public class Charactor {
	protected int HP;
	protected int power;
	protected String winner;
	
	public double getDistance(int x, int y, int x1, int y1){
		return Math.sqrt(Math.pow(Math.abs(x1-x), 2) + Math.pow(Math.abs(y1-y), 2));
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
}
