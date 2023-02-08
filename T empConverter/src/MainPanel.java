import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainPanel{
    private JPanel panelMain;
    private JTextField inputTextField;
    private JButton fToCButton;
    private JTextField outputTextField;
    private JTextField outputTextField1;
    private JButton cToFButton;
    private JTextField textField1;
    public MainPanel() {
        fToCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = inputTextField.getText();
                double result = ((Double.parseDouble(num1) - 32) *5/9);
                outputTextField.setText(String.valueOf(result));
            }
        });


        cToFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                double result = ((Double.parseDouble(num1) * 9/5 + 32));
                outputTextField1.setText(String.valueOf(result));
            }
        });
    } // end constructor

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainPanel");
        frame.setContentPane(new MainPanel().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}// end MainPanel
