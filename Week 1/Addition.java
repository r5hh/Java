import javax.swing.*;

public class Addition{
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis()% 10);
        int number2 = (int)(System.currentTimeMillis()* 7 % 10);

        String answerS = JOptionPane.showInputDialog(number1 + "+" + number2 + "=" );

        int answer = Integer.parseInt(answerS);

        JOptionPane.showMessageDialog(null, number1 + "+" + number2 + "=" + answer + " " + (number1 + number2 == answer));
    }
}
