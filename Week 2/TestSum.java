import javax.swing.JOptionPane;

public class TestSum {
    public static void main(String[] args) {

        float sum = 0;
        for (float i = 0.01f ; i < 1.0f; i += 0.01f)
            sum += i;

        JOptionPane.showMessageDialog(null, "the sum is " + sum);

    }
    
}
