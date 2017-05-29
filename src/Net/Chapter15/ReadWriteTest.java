package Net.Chapter15;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReadWriteTest {

	public static void main(String[] args) {
		JFrame f = new TextEditorFrame();
		f.setVisible(true);
	}

}

class TextEditorFrame extends JFrame {
	public TextEditorFrame(){
		setTitle("shbdf");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		final JTextArea content = new JTextArea();
		add(content,BorderLayout.CENTER);
		
		JButton readerButton = new JButton("reader");
		JButton writerButton = new JButton("writer");
		
	/*	readerButton.addActionListener(new ActionListener(){
	 		public void actionPerformed (ActionEvent e){
	 			FileReader reader = null;
	 		try{
	 			reader = new FileReader(editorFile);
	 		char[] _content = new char[1024];
	 		int flag = -1;
	 		StringBuilder s = new StringBuilder();
	 		while (flag = reader.read(_content)!=-1){
	 		String eachContent = new String(_content,0,flag);
	 		s.append(eachContent);
	 		}
	 		content.setText(s.toString());
	 	}catch(Exception ee){
	 	}finally{
	 		try{
	 			if(reader!=null){
	 				reader.close();
	 		}
	 	}catch(Exception eee){
	 	}
	 	}
	 	}
	 	}};
*/
	JPanel southPanel = new JPanel();

	southPanel.setLayout(new GridLayout(1,2));southPanel.add(readerButton);southPanel.add(writerButton);

	add(southPanel,BorderLayout.SOUTH);

	}
}