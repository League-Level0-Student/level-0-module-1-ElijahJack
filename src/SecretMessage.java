import javax.swing.JOptionPane;

public class SecretMessage {
public static void main(String[] args) {
String password = "Adi is Annoying.";
String message = JOptionPane.showInputDialog("What is your secret message?");
JOptionPane.showInputDialog("You can only see the secret message if you can guess the password. What is the password?");
}
}
