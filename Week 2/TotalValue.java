import javax.swing.JOptionPane;

public class TotalValue {
    public static void main(String[] args) {
        
        String dataString = JOptionPane.showInputDialog("Enter value :\n (0 for exit)");
        int data = Integer.parseInt(dataString);
        int sum =0;
        while (data != 0){
            sum +=data;

            dataString = JOptionPane.showInputDialog("Enter value :\n (0 for exit)");
            data = Integer.parseInt(dataString);
        }

        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}