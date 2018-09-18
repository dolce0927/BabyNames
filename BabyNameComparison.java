import javax.swing.*;
public class BabyNameComparison
{
	public static void main(String[] args)
	{
		String userEntry1;
		String userEntry2;
		String userEntry3;
		
	userEntry1 = JOptionPane.showInputDialog(null, "Please enter a desired Baby Name");
	userEntry1 = userEntry1.toUpperCase();

	userEntry2 = JOptionPane.showInputDialog(null, "Please enter a second desired Baby Name");
	userEntry2 = userEntry2.toUpperCase();

	userEntry3 = JOptionPane.showInputDialog(null, "Please enter a third desired Baby Name");
	userEntry3 = userEntry3.toUpperCase();

/*3 entries would normally yeild a 3! of 6 combos total,
1,2
1,3
2,3
2,1
3,1
3,2
the last three are indeed combos but are the same options as the first three in different variation therefore only 3 options displayed.*/

	JOptionPane.showMessageDialog(null, "Great Names!! \nYour three possible two name combinations are: \n" + userEntry1 + " & " + userEntry2 + "\n" + userEntry1 + " & " + userEntry3 + "\n" + userEntry2 + " & " + userEntry3);

	}
}