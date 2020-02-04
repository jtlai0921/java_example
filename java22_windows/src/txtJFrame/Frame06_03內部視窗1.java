package txtJFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Frame06_03內部視窗1 extends JFrame {

    public JButton JB1;
    public JDesktopPane jdp;
    public Container ContentPane;
    public static int count;

    public Frame06_03內部視窗1() {

        initComponents();
    }

    private void initComponents() {
        ContentPane = this.getContentPane();
        ContentPane.setLayout(new BorderLayout());

        JB1 = new JButton("New Frame");
        jdp = new JDesktopPane();
        JB1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                choose(evt);
            }
        });
        ContentPane.add(JB1, BorderLayout.SOUTH);
        ContentPane.add(jdp);

        this.setTitle(getClass().getName());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);

    }

    public void choose(ActionEvent evt) {

        JInternalFrame jif;
        jif = new JInternalFrame("Frame " + (count++), true, true, true, true);
        Container icp = jif.getContentPane();

        JButton ibtn = new JButton("JInternalFrame Button");
        icp.add(ibtn, BorderLayout.SOUTH);
        jdp.add(jif);
        jif.setSize(200, 150);
        jif.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame06_03內部視窗1();
    }
}
