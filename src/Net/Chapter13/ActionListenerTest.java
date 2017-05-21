package Net.Chapter13;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ActionListenerTest extends JFrame {
	public ActionListenerTest(){
		setTitle("¼àÌý");
		setSize(300,200);
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener){
			public void actionPerformed (ActionEvent exit){
				System.out.println("ÄãÒªÍË³ö");
				System.exit(0);
			}
		
	}

	public static void main(String[] args) {
		
	}

}
