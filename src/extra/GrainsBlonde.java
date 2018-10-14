package extra;

import javax.swing.JOptionPane;

public class GrainsBlonde {
	int codeCracker;
	boolean codeWorks;

	int findCode(int code) {
		for (int i = 0; i < 1000000; i++) {
			if (i == code) {
				codeCracker = i;
				System.out.println(i);
				JOptionPane.showMessageDialog(null, "I've got it! The code is " + i);
				break;
			} else {
				codeCracker = -1;
			}
			System.out.println(i);
		}
		if (codeCracker == -1) {
			JOptionPane.showMessageDialog(null, "Dagnabbit! I've been thwarted!");
		}
		return codeCracker;
	}
}
