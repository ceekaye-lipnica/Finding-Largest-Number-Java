package OwnProgram;
import javax.swing.JOptionPane;

public class Largest {
	
	int num1, num2, num3;
	
	Largest(int n1, int n2, int n3){
		num1 = n1;
		num2 = n2;
		num3 = n3;
	}
	
	void findLargest() {
		if (num1 >= num2 && num1 >= num3 ) {
			JOptionPane.showMessageDialog(null, "You've enter: " + num1 + ", " + num2 + ", " + num3 + "\n\n" + "The Largest Number is: " + num1, "FINDING THE LARGEST NUMBER", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (num2 >= num1 && num2 >= num3) {
			JOptionPane.showMessageDialog(null, "You've enter: " + num1 + ", " + num2 + ", " + num3 + "\n\n" + "The Largest Number is: " + num2, "FINDING THE LARGEST NUMBER", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You've enter: " + num1 + ", " + num2 + ", " + num3 + "\n\n" + "The Largest Number is: " + num3, "FINDING THE LARGEST NUMBER", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
