package Net.Chapter13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class GridLayoutTest extends JFrame {
	public GridLayoutTest(){
		Container c = getContentPane();
		setLayout(new GridLayout(7,3,5,5));
		for (int i=1;i<31;i++){
			c.add(new JButton("按钮"+i));
		}
		setSize(400,400);
		setTitle("网格布局");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
