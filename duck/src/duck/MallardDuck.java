package duck;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super(new FlyWithwing(), new Squack());
		display();
		performfly();
		performquack();
		swim();
	}

	@Override
	public String display() {
		return "청둥오리 입니다. 만나서 반갑습니다.";
	}

	@Override
	public String toString() {
		return display() + "\n" + performfly() + "\n" + performquack() + "\n" + swim();
	}
	
	
}
