package duck;

public class RedheadDuck extends Duck{
	
	public RedheadDuck() {
		super(new FlyWithwing(), new Squack());
		display();
		performfly();
		performquack();
		swim();
	}

	@Override
	public String display() {
		return "빨간머리 오리입니다. 만나서 Nice to Meet you";
	}
	
	@Override
	public String toString() {
		return display() + "\n" + performfly() + "\n" + performquack() + "\n" + swim();
	}
}
