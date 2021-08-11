import javax.swing.JOptionPane;

public class TestBreak {

    public static void main(String[] args) {

        String numberstring = JOptionPane.showInputDialog("select a number");
        int number = Integer.parseInt(numberstring);

        String sumstring = JOptionPane.showInputDialog("input the sum total");
        int sum = Integer.parseInt(sumstring);

        int a = 0;
        int b = 0;

        while (a < number) {
            a ++;
            b += a;
            if (b >= sum) break;
        }
        
        String output = ("the break number is " + a + ", n/" + "The sum is " + b);
        JOptionPane.showMessageDialog(null, output);

    }
    
}
