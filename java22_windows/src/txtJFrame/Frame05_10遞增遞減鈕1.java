package txtJFrame;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Frame05_10遞增遞減鈕1 extends JFrame {

    public JLabel JL1;
    public JSpinner jspinner1;
    public Container ContentPane;

    public Frame05_10遞增遞減鈕1() {
        initComponents();
    }

    private void initComponents() {
        
        ContentPane = this.getContentPane();
        ContentPane.setLayout(null);

        JL1 = new JLabel("年齡 ");
        jspinner1 = new JSpinner(new SpinnerNumberModel(20, 1, 100, 1));
        
        JL1.setBackground(Color.yellow);
        JL1.setOpaque(true);          
        
        JL1.setBounds(20, 20, 150, 40);
        jspinner1.setBounds(20, 80, 150, 40);
        
        jspinner1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                choose(evt);
            }
        });
        
        ContentPane.add(JL1);
        ContentPane.add(jspinner1);

        this.setTitle(getClass().getName());
        this.setBounds(200, 100, 300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void choose(ChangeEvent evt) {
        JL1.setText("年齡 ");
        int number = (Integer) jspinner1.getValue();
        JL1.setText(JL1.getText() + String.valueOf(number));
    }

    public static void main(String[] args) {
        new Frame05_10遞增遞減鈕1();
    }
}
