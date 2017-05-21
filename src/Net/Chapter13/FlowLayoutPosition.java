package Net.Chapter13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class FlowLayoutPosition extends JFrame {
	
	public FlowLayoutPosition(){
		setTitle("流布局");
		Container c = getContentPane();
		setLayout(new FlowLayout(2,10,10));
		for (int i=1;i<64;i++){
			c.add(new JButton("按钮" + i));
		}
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FlowLayoutPosition();
	}

}
