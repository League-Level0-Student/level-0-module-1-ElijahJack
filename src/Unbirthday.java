import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your Birthday? (Month/Day)");
		if (birthday.equalsIgnoreCase("March 18")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");

		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
	}

}
