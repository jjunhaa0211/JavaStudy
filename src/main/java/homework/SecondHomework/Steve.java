package homework.SecondHomework;

public class Steve extends Player {
	private String name;

	public Steve() {
		this.name = "Steve";
	}

	protected Steve(int health) {
		super(health, 0);
		this.name = "Steve";
	}

	public Steve(double luck) {
		super(50, 0, luck);
		this.name = "Steve";
	}

	private Steve(int health, int speed) {
		super(health, speed);
		this.name = "Steve";
	}

	public String getName() {
		return name;
	}

	private void boost() {
		speed += 100;
	}
}