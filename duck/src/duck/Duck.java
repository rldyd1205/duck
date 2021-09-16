package duck;

public abstract class Duck {
	private FlyBehavior   flyBehavior;
	private QuackBehavior quackBehavior;
	
	// 생성자
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.setFlyBehavior(flyBehavior);
		this.setQuackBehavior(quackBehavior);
	}
	
	// setter
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	// 호출시 fly를 실행하기위해 준비하는 메서드
	public String performfly() {
		return flyBehavior.fly();
	}
	
	// 호출시 quack를 실행하기위해 준비하는 메서드
	public String performquack() {
		return quackBehavior.quack();
	}
	
	// 각 오리 클래스에서 구현시키기 위해 설계하는 추상 메서드
	public abstract String display();
	
	// 모든 오리들의 공통된 메서드
	public String swim() {
		return "오리 수영하다";
	}
}
