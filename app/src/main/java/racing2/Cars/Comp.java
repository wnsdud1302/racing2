package racing2.Cars;
//경쟁자 자동차

public class Comp extends Car {

	Comp(int x, int y, String path) {
		super(x, y, path);
		
	}

	public void move(int speed){
		this.y += speed;
	}
}
