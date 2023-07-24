import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
	
	static final int SCREEN_WIDTH = 600; //width of frame
	static final int SCREEN_HEIGHT = 600; // height of frame
	static final int UNIT_SIZE = 25; // small frame size
	static final int GAME_UNIT = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE); //total game small frames
	static final int DELAY = 75; //time delay
	final int x[] = new int[GAME_UNIT]; //to store x cordinates of the aaples
	final int y[] = new int[GAME_UNIT]; // to store y cordinates of the apples
	int bodyparts=6; //initial size of snake
	int appleEaten; 
	int appleX;
	int appleY;
	char direction = 'D';
	boolean running = false;
	Timer timer;
	Random random;
	
	GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT)); //prefered size of frame
		this.setBackground(Color.black); // color of the frame is black
		this.setFocusable(true); //keep focuasable
		this.addKeyListener(new MyKeyAdapter());
		startGame(); 
	}
	public void startGame() {
		newApple(); 
		running=true;
		timer=new Timer(DELAY,this);
		timer.start();
	}
	public void paintComponets(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
			g.drawLine(i*UNIT_SIZE,0,i*UNIT_SIZE,SCREEN_HEIGHT);
			g.drawLine(0,i*UNIT_SIZE,SCREEN_WIDTH,i*UNIT_SIZE);
		}
		g.setColor(Color.red);
		g.fillOval(appleX,appleY,UNIT_SIZE,UNIT_SIZE);
	}
	public void newApple() {
		appleX =random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY =random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void move() {
		
	}
	public void checkApple(){
		
	}
	public void checkCollition() {
		
	}
	public void gameOver(Graphics g) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			
		}
		
	}

}
	