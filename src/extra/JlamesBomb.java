package extra;

import javax.swing.JOptionPane;

public class JlamesBomb {
	int code;

	JlamesBomb(int secret) {
		code = secret;
	}

	int returnCode() {
		return code;
	}

	boolean tryCode(int yeet) {
		if (yeet == code) {
			JOptionPane.showMessageDialog(null, "The vault opened. Code cracked!");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "The code didn't work. Guess it's not like the movies.");
			return false;
		}
	}
}
