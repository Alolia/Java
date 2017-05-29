package Net.Chapter13;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class JFrameTest extends JFrame {
	public void CreateJFrame(String title){
		JFrame jf =new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("窗体，没错，这是窗体！");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.PINK);
		jf.setVisible(true);
		jf.setSize(388, 288);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new JFrameTest().CreateJFrame("哈哈哈哈");
	}
}
