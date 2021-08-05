import javax.swing.JOptionPane;

public class Subtraction {    
	public static void main(String[] args) {
        
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();

        String output = "";

        while (count < 10) {
            int number1 = (int)(Math.random()*100);
            int number2 = (int)(Math.random()*100);

            if (number1 < number2) {
                int temp =number1;
                number1 = number2;
                number2 = temp;
            }
        
            String answerString = JOptionPane.showInputDialog("What is " + number1 + " - " + number2 + "?");
            int answer = Integer.parseInt(answerString);

            String replyString;

            if (number1 - number2 == answer) {
                replyString ="Correct";
                correctCount++;
            }

            else 
                replyString = "Wrong! " + number1 + " - " + number2 + " is " + (number1 - number2);
                JOptionPane.showMessageDialog(null, replyString);

            count++;

            output += "\n" + number1 + " - " + number2 + " = " + answerString + ((number1 - number2 == answer)? " correct" : " wrong");

            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            JOptionPane.showMessageDialog(null, "Total Count: " + count + "\nCorrect: " + correctCount + "\nTest time: " + testTime/1000 + "s\n" + output);
        }   
        
    }
}
