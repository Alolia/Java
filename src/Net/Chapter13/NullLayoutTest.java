package Net.Chapter13;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutTest extends JFrame {

	public NullLayoutTest(){
		setSize(500,400);
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JLabel jl =new JLabel("��ӭ");
		jl.setBounds(200, 200, 100, 80);
		JLabel swing = new JLabel("swing");
		add(swing);
		add(jl);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
}
