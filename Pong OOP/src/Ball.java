import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int x, y;  	//position
	private int vx, vy; //velocity
	private int size; 	//width
	private Color ballColor;
	public double score;
	
	public Ball() {
		x = 425;
		y = 250; 
		vx = 0;
		vy = 0;
		size = 20;
		ballColor = new Color(250, 212, 192);
		
	}
	
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	public Color getBallColor() {
		return ballColor;
	}

	public void setBallColor(Color ballColor) {
		this.ballColor = ballColor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVx() {
		return vx;
	}

	public void setVx(int vx) {
		this.vx = vx;
	}

	public int getVy() {
		return vy;
	}

	public void setVy(int vy) {
		this.vy = vy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void update() {
		y += vy;
		x += vx;
		if (x <= 0  || x >=750) {
			x = 400;
			y = 250;
			vx = 0;
			vy = 0;
			vx = -vx;
			score = 0;
			
		}
		if (y <= 0 || y >= 550) {
			vy = -vy;	
		}
	}

	public void paint(Graphics g) {
		update();
		g.setColor(ballColor);
		g.fillOval(x, y, size, size);
	}
	
	/**
	 * Update the x and y variables
	 */
	
}
	
	
	

