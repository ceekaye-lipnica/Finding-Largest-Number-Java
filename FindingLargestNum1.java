package OwnProgram;
import javax.swing.JOptionPane;

public class LargeNum {
	
	//Program by: Chelsea Kate M. Lipnica
	// BSIT 2 - 1

	public static void main(String[] args) {
		
		int fnum = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
		int snum = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
		int tnum = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number: "));

		Largest largeNum = new Largest(fnum, snum, tnum);
		
		largeNum.findLargest();
	}
	
}
