package Net.Chapter18;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class threadSleepTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				new ThreadSleepFrame();
			}
		});
	}

}

class ThreadSleepFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5631093107378193401L;
	private static Color[] colors = {
			Color.RED,
			Color.BLUE,
			Color.BLACK,
			Color.CYAN,
			Color.YELLOW,
			Color.GREEN,
			Color.MAGENTA,
			Color.WHITE	
	};
	
	public ThreadSleepFrame(){
		setTitle("Thread Sleep Test");
		setSize(300,200);
		setVisible(true);
		new Thread(new Runnable(){
			int x=50;
			int y=100;
			@Override
			public void run() {
				while(true){
					Random r = new Random();
					int index = r.nextInt(colors.length-1);
					Graphics g = getGraphics();
					g.setColor(colors[index]);
					g.drawLine(x, y, 100, y++);
					if(y>80){
						y=50;
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}