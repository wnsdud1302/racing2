package racing2.Cars;
//플레이어 자동차

public class Player extends Car {

	Player(int x, int y, String path) {
		super(x, y, path);
		
	}

	public void move(int vmove, int hmove){
		this.x += vmove;
		this.y += hmove;
	}

}
