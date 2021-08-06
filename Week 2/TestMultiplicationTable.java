import javax.swing.JOptionPane;

public class TestMultiplicationTable {

    public static void main(String[] args) {

        String output = "     Multiplication Table\n";
        output += "-----------------------------------\n";

        output += "    | ";
        for (int j = 1; j <= 9; j++)
            output += "   " + j;

        output += "\n";

        for (int i = 1; i <= 9; i++) {
            output += i + "   | ";

            for (int j = 1; j <= 9; j++) {
                
                if (i * j < 10)
                    output += " " + i * j;
                else 
                    output += " " + i * j;
    
            }
            output += "\n";      
        }
    
    JOptionPane.showMessageDialog(null, output);
    }
}
