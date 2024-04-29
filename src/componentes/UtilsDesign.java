package componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JButton;
import javax.swing.JTextField;

public class UtilsDesign {
    static Color blue = new Color(30,39,114);
    static Color white = new Color(255,255,255);
    static Color blueB = new Color (30,39,114);
    
    private UtilsDesign(){}
    
    
    public static void buttonEffect(JButton btn1, JButton btn2){
        btn1.setBackground(blue);
        btn2.setBackground(white);

        btn1.setForeground(white);
        btn2.setForeground(blue);
    }
    
    public static void textPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }
    
    
}
