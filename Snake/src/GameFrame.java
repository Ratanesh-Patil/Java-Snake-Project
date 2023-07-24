import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");// name the title 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//restrict the resize thats why we make it false 
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // for frame location at the middle of window
	}
}
