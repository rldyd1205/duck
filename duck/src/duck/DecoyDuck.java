package duck;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super(new FlyNoway(), new Qquack());
		display();
		performfly();
		performquack();
		swim();
	}

	@Override
	public String display() {
		return "나는 모형오리입니다 おはようございます！";
	}
	
	@Override
	public String toString() {
		return display() + "\n" + performfly() + "\n" + performquack() + "\n" + swim();
	}
	
}
