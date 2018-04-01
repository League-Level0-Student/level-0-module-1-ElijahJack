import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {

		int score = 0;
		JOptionPane.showMessageDialog(null,
				"We are going to play a game! If you answer my riddle correctly, you get a point. If you answer it incorrectly, nothing really happens.");
		String Answer1 = JOptionPane.showInputDialog(
				"What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
		if (Answer1.equalsIgnoreCase("Nothing")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		String Answer2 = JOptionPane.showInputDialog(
				"Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		if (Answer2.equalsIgnoreCase("A coffin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
	}
}
}
