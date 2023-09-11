import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Pong extends Frame {
	Ball ball = new Ball();
	Paddle leftPaddle = new Paddle(0,250,30,100);
	Paddle rightPaddle = new Paddle(750,250,30,100);
	double score = 0;

	
	
	
				
	/* paint is getting called roughly 60x per second */
	public void paint(Graphics g) {
		super.paintComponent(g);
		update();
		g.setColor(new Color(254,233,225));
		g.fillRect(0,0,800,600);
		ball.paint(g);
		leftPaddle.paint(g);
		rightPaddle.paint(g);
		g.setFont(getFont());
		g.drawString(score+ "" ,375,50);
		
		
	}

	
	
	
	
	public void keyPressed(KeyEvent key) {
		System.out.println(key.getKeyCode());
		if (key.getKeyCode() == 32) {
			ball.setVx(3);
			ball.setVy(5);
			score = 0;
			
		}
		if (key.getKeyCode() == 83) {
			leftPaddle.setVy(10);
		}
		if (key.getKeyCode() == 87) {
			leftPaddle.setVy(-10);
		}
		if (key.getKeyCode() == 76) {
			rightPaddle.setVy(10);
		}
		if (key.getKeyCode() == 79) {
			rightPaddle.setVy(-10);
		}
	}


	public void keyReleased(KeyEvent key) {
		System.out.println(key.getKeyCode());
		if (key.getKeyCode() == 83) {
			leftPaddle.setVy(0);
		}
		if (key.getKeyCode() == 87) {
			leftPaddle.setVy(0);
		}
		if (key.getKeyCode() == 76) {
			rightPaddle.setVy(0);
		}
		if (key.getKeyCode() == 79) {
			rightPaddle.setVy(0);
		}
		}
	


	public void keyTyped(KeyEvent key) {

		
	}
	
	public void update() {
		boolean yOverlap1 =((leftPaddle.getY() <= ball.getY()) && (ball.getY() < leftPaddle.getY() + leftPaddle.setHeight())) || ((ball.getY() <= leftPaddle.getY()) && (leftPaddle.getY() < ball.getY() + ball.getSize()));
		boolean xOverlap1 =((leftPaddle.getX() <= ball.getX()) && (ball.getX() < leftPaddle.getX() + leftPaddle.setWidth())) || ((ball.getX() <= leftPaddle.getX()) && (leftPaddle.getX() < ball.getX() + ball.getSize()));
		boolean yOverlap2 =((rightPaddle.getY() <= ball.getY()) && (ball.getY() < rightPaddle.getY() + rightPaddle.setHeight())) || ((ball.getY() <= rightPaddle.getY()) && (rightPaddle.getY() < ball.getY() + ball.getSize()));
		boolean xOverlap2 =((rightPaddle.getX() <= ball.getX()) && (ball.getX() < rightPaddle.getX() + rightPaddle.setWidth())) || ((ball.getX() <= rightPaddle.getX()) && (rightPaddle.getX() < ball.getX() + ball.getSize()));
		if (yOverlap1 == true && xOverlap1 == true) {
			ball.setVx(-(ball.getVx() +1));
			score = score + 1;
			System.out.print(xOverlap1);
			System.out.print(yOverlap1);
		}
		if (yOverlap2 == true && xOverlap2 == true) {
			ball.setVx(-1 * (int) Math.random() *2 -3);
			score = score + 1;
			//System.out.print(xOverlap2);
			//System.out.print(yOverlap2);
		}
	}
	public static void main(String[] arg) {
		Pong p = new Pong();
		
		
		
	}
	
}
