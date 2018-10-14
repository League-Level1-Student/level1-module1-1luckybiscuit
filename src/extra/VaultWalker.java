package extra;

public class VaultWalker {
	public static void main(String[] args) {
		GrainsBlonde BlamesMom = new GrainsBlonde();
		JlamesBomb BrainsJond = new JlamesBomb(124367565);
		int realCode = BlamesMom.findCode(BrainsJond.returnCode());
		BrainsJond.tryCode(realCode);
	}
}
