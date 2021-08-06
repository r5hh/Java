import javax.swing.JOptionPane;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog("Enter first integer");
        int n1 = Integer.parseInt(s1);

        String s2 = JOptionPane.showInputDialog("Enter second integer");
        int n2 = Integer.parseInt(s2);

        int gcd =1;
        int k = 1;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 %k ==0)
                gcd =k;
            k++;
        }
        
        String output = "The greastest common divisor for " + n1 + " and " + n2 + " is " + gcd;
        JOptionPane.showMessageDialog(null, output);
    }
    
}
