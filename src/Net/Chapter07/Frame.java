package Net.Chapter07;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		new DFrame();
	}

}


@SuppressWarnings("serial")
class DFrame extends JFrame{
	public DFrame(){
		this.setTitle("hello");
		this.setSize(400,300);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}