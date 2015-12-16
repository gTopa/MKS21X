import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class Window3 extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public Window3() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("FtoC");
	b.addActionListener(this);
	b.setActionCommand("toC");
	JButton b2 = new JButton("CtoF");
	b2.addActionListener(this);
	b2.setActionCommand("toF");


	t = new JTextField(10);

	j = new JLabel("Answer: ");
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("toC")){
	    String s = j.getText();
	    s += (Integer.parseInt(t.getText())-32)*5/9.0;
	    j.setText(s);
	}
	if(event.equals("toF")){
	    String s = j.getText();
	    s += Integer.parseInt(t.getText())*9/5.0+32;
	    j.setText(s);
	}
    }
}
