import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class MyWindowForm extends JFrame {

	private JFrame frame;
	private final int WIDTH = 345, HEIGHT = 205;
	
	public static void main(String[] args) {
		MyWindowForm window = new MyWindowForm("First Program");
		window.frame.setVisible(true);
	}
	
	public MyWindowForm(String title) {
		super(title);
		initial();
	}

	public void initial() {
		frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int cx = dim.width/2 - frame.getSize().width/2;
		int cy = dim.height/2 - frame.getSize().height/2;
		frame.setLocation(cx, cy);
		
		frame.getContentPane().setLayout(null);
		
		JLabel lblname = new JLabel("Input your name");
		lblname.setBounds(30, 25, 100, 20);
		frame.getContentPane().add(lblname);
		
		JTextField txtname = new JTextField();
		txtname.setBounds(135, 25, 150, 20);
		frame.getContentPane().add(txtname);
		
		JLabel lblscore = new JLabel("Input your score");
		lblscore.setBounds(30, 65, 100, 20);
		frame.getContentPane().add(lblscore);
		
		JTextField txtscore = new JTextField();
		txtscore.setBounds(135, 65, 150, 20);
		frame.getContentPane().add(txtscore);
		
		JButton button = new JButton("Show Result");
		button.setBounds(135, 105, 150, 30);
		frame.getContentPane().add(button);
		
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(txtname.getText().equals("") || txtscore.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please input any data.");
				}
				else {
					String name = txtname.getText();
					int score = Integer.parseInt(txtscore.getText());
					JOptionPane.showMessageDialog(null, name + " is " + (score >= 50? "PASS" : "FAIL"));
				}
				txtname.setText("");
				txtscore.setText("");
			}
	    });
	}
}
