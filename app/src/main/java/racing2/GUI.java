package racing2;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class GUI extends JFrame {
	int WIDTH = 500;
	int HEIGHT = 800;
	
	private Image game_screen = new ImageIcon(Menu.RESOURCE_PATH+"/bgg.gif").getImage();

	private Graphics graphics;

	
	public GUI() throws MalformedURLException {
		BackgroundImage bgImage = new BackgroundImage();
		setTitle("Racing");
		setSize(WIDTH, HEIGHT);
		Container c = this.getContentPane();
		System.out.println(game_screen.getWidth(c));

		c.add(bgImage);
		System.out.println(bgImage.getComponentCount());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		//init();
	}
	
	
	private void init() {
		Image buffeImage = createImage(WIDTH, HEIGHT);
		graphics = buffeImage.getGraphics();
		draw(graphics);
		graphics.drawImage(buffeImage, ALLBITS, ABORT, null);

	}
	
	public void draw(Graphics g) {
		g.drawImage(game_screen, ALLBITS, ABORT, null);
	}
	

}

class BackgroundImage extends JPanel{
	int WIDTH = 500;
	int HEIGHT = 800;

	Image img;

	BackgroundImage() throws MalformedURLException {
		img = Toolkit.getDefaultToolkit().createImage(Menu.RESOURCE_PATH + "/bgg.gif");
	}
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		if (img != null) {  
		      g.drawImage(img, 0, 0, this);  
		    } 
	}
	

}
