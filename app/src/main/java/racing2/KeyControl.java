package racing2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyControl extends KeyAdapter{
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_A:
				//player.setLeft(true);
				break;
			case KeyEvent.VK_D:
				//player.setRight(true);
				break;
			case KeyEvent.VK_W:
				break;
			case KeyEvent.VK_S:
				break;
			case KeyEvent.VK_ESCAPE:	
				System.exit(0);		//esc누르면 꺼짐
				break;
			
			case KeyEvent.VK_ENTER:	//enter 누르면 게임화면으로
				//if(isMenu_Screen) {
				//	gameStart();
				//}
				break;
			case KeyEvent.VK_R:
				//if(player.gameOver())
				//	player.reset();
				break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_A:
				//player.setLeft(false);
				break;
			case KeyEvent.VK_D:
				//player.setRight(false);
				break;
			
		}
	}
}
