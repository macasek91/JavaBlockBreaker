import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Block {
	int x, y, width, height;
	Image pic;
	Block(int a, int b, int w, int h, String s){
		x = a;
		y = b;
		width = w;
		height = h;
		pic = Toolkit.getDefaultToolkit().getImage(s);
	}
	
	public void draw(Graphics g, Component c){
		g.drawImage(pic, x, y, width, height, c);
	}
	
}
