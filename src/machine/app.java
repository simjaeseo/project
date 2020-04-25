package machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {
    private JPanel mainpanel;
    private JLabel titleLab;
    private JPanel panel;
    private JPanel imgPan;
    private JPanel imgpan1;
    private JPanel img2;
    private JPanel imgPan3;
    private JButton up1;
    private JButton down1;
    private JButton up2;
    private JButton down2;
    private JButton up3;
    private JButton down3;
    private JPanel imgPan11;
    private JPanel imgPan21;
    private JPanel imgPan31;
    private JLabel imgLab1;
    private JLabel imgLab2;
    private JLabel imgLab3;
    private JPanel amountPan;
    private JButton buy;
    private JPanel sumPan;
    private JLabel sumLab1;
    private JPanel sumNumPan;
    private JPanel changePan;
    private JLabel gae1;
    private JLabel gae2;
    private JLabel gae3;
    private JLabel gae4;
    private JLabel gae5;
    private JLabel gae6;
    private JLabel gae7;
    private JPanel tenthou;
    private JPanel fivethou;
    private JPanel thou;
    private JPanel fivehen;
    private JPanel hen;
    private JPanel fifty;
    private JPanel ten;


    public static void main(String[] args) {
        JFrame frame = new JFrame("app");
        frame.setContentPane(new app().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);






    }

    private void createUIComponents() {
        imgLab1 = new JLabel(new ImageIcon("coke.jpg"));
        imgLab2 = new JLabel(new ImageIcon("chocolate.jpg"));
        imgLab3 = new JLabel(new ImageIcon("nacho.jpg"));
    }
}