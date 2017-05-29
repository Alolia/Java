package Net.Chapter13;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class DialogTest extends JDialog{
	public DialogTest(MyFrame frame){
		super(frame,"第一个JDialog窗体",true);
		Container container = getContentPane();
		container.add(new JLabel("对话框"));
		setBounds(150,150,150,150);
	}
}

public class MyFrame extends Frame {
	public static void main(String[] args) {
		new MyFrame();
	}
	public MyFrame(){
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl= new JLabel("JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb = new JButton("弹出对话框");
		jb.setBounds(10, 10, 100, 30);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DialogTest(MyFrame.this).setVisible(true);
			}
		});
		container.add(jb);
	}

}



