import javax.swing.JOptionPane;

public class computerloan {

    public static void main(String[] args) {
        String Intereststring = JOptionPane.showInputDialog("Interest:");
        double InterestRate = Double.parseDouble(Intereststring);
        double monthlyInterest = InterestRate/1200;
        
        String yearString = JOptionPane.showInputDialog("Enter year: ");
        int year = Integer.parseInt(yearString);
        
        String loanString = JOptionPane.showInputDialog("Enter loan amount: ");
        double loanAmount = Double.parseDouble(loanString);

        double monthlyPayment = loanAmount*monthlyInterest/(1-1/Math.pow(1 + monthlyInterest, year*12));
        double totalPayment = monthlyPayment*year*12;

        monthlyPayment = (int)(monthlyPayment*100)/100.0;
        totalPayment = (int)(totalPayment*100)/100.0;

        String output = "The montly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
        JOptionPane.showMessageDialog(null, output);
    }
}



