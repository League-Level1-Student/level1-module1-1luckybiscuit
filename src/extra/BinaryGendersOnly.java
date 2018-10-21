package extra;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryGendersOnly implements MouseListener {
	JFrame de = new JFrame();
	JPanel spa = new JPanel();
	JTextField ci = new JTextField(20);
	JLabel to = new JLabel();
	JButton two = new JButton("Convert");
	public static void main(String[] args) {
		BinaryGendersOnly a = new BinaryGendersOnly();
		a.setup();
	}

	void setup() {
		de.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		two.addMouseListener(this);
		de.add(spa);
		spa.add(ci);
		spa.add(to);
		spa.add(two);
		two.setPreferredSize(new Dimension(80,30));
		to.setVisible(true);
		de.setVisible(true);
		de.setTitle("Converts 8 bits of binary to number");
		de.pack();
	}
	void bitSplit(String code) {
		String[] codes = code.split(" ");
		String anyLenny = "";
		for(int i = 0;i<codes.length;i++) {
			anyLenny += convert(codes[i]);
		}
		to.setText(anyLenny);
		System.out.println(anyLenny);
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "8 bits per byte, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String text = ci.getText();
//		String label = convert(text);
//		to.setText(label);
//		System.out.println(text);
//		System.out.println(label);
		bitSplit(text);
		de.pack();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
