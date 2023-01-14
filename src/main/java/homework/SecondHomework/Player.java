package homework.SecondHomework;

public class Player {
	private int health;
	protected int speed;
	private double luck;

	/**
	 * @param health
	 * @param speed
	 */
	public Player(int health, int speed) {
		this.health = health;
		this.speed = speed;
		this.luck = 0;
	}

	public Player(int health, double luck) {
		this.health = health;
		this.speed = 0;
		this.luck = luck;
	}

	protected Player(int health, int speed, double luck) {
		this.health = health;
		this.speed = speed;
		this.luck = luck;
	}

	//스티브 클래스를 사용할 수 있는 생성자는 2개입니다

	Player() {
		this.health = 50;
		this.speed = 0;
		this.luck = 0;
	}

	public int getHealth() {
		return health;
	}

	protected int getSpeed() {
		return speed;
	}

	public double getLuck() {
		return luck;
	}

	void printHealth() {
		System.out.println("Health: " + health);
	}

	//Steve 클래스 내에서 super()를 통해 호출 가능한 생성자는 모두 몇 개인가요?
	//3개

}