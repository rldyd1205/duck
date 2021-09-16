package duck;

public class MuteDuck extends Duck{

	public MuteDuck() {
		super(new FlyNoway(), new Qquack());
		display();
		performfly();
		performquack();
		swim();
	}

	@Override
	public String display() {
		return "뮤트오리 소리를 섞습니다.";
	}
	
	@Override
	public String toString() {
		return display() + "\n" + performfly() + "\n" + performquack() + "\n" + swim();
	}
}
