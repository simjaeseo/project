package machine;

import javax.swing.*;

public class app2 {

    private JPanel wonPan;
    private JLabel tenthou;
    private JLabel fivethou;
    private JLabel thou;
    private JLabel fivehen;
    private JLabel hen;
    private JLabel fitfy;
    private JLabel ten;
    private JLabel gae1;
    private JLabel gae2;
    private JLabel gae3;
    private JLabel gae4;
    private JLabel gae5;
    private JLabel gae6;
    private JLabel gae7;
    private JPanel gaePan;
    private JPanel changePan;
    private JPanel change1;
    private JPanel change2;
    private JPanel change3;
    private JPanel change4;
    private JPanel change5;
    private JPanel change6;
    private JPanel change7;
    private JPanel resultPan;


    public static void main(String[] args) {
        JFrame frame = new JFrame("app2");
        frame.setContentPane(new app2().resultPan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
