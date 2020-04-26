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
    private JLabel numLab1;
    private JLabel numLab2;
    private JLabel numLab3;
    private JPanel wonPan;
    private JPanel wonChangePan;
    private JPanel gaePan;
    private JLabel won1;
    private JLabel won2;
    private JLabel won3;
    private JLabel won4;
    private JLabel won5;
    private JLabel won6;
    private JLabel won7;
    private JLabel sumNumLab;
    private JTextField giveTxt;
    private JLabel change1;
    private JLabel change2;
    private JLabel change3;
    private JLabel change4;
    private JLabel change5;
    private JLabel change6;
    private JLabel change7;

    int cokenum=0;      //콜라 1950원
    int chocolatenum=0; //초콜릿 3400
    int nachonum=0;     // 나초 8710원
    int myMoney =0;     // 투입금액
    int jandon=0;

    public app() {
        up1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cokenum++;
            numLab1.setText(String.valueOf(cokenum));
                sumNumLab.setText(String.valueOf(cokenum*1950+chocolatenum*3400+nachonum*8710));
            }
        });
        down1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cokenum--;
                if(cokenum<=0) cokenum = 0;
                numLab1.setText(String.valueOf(cokenum));
                sumNumLab.setText(String.valueOf(cokenum*1950+chocolatenum*3400+nachonum*8710));
            }
        });
        up2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chocolatenum++;
                numLab2.setText(String.valueOf(chocolatenum));
                sumNumLab.setText(String.valueOf(cokenum*1950+chocolatenum*3400+nachonum*8710));
            }
        });
        down2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chocolatenum--;
                if(chocolatenum<=0) chocolatenum = 0;
                numLab2.setText(String.valueOf(chocolatenum));
                sumNumLab.setText(String.valueOf(cokenum*1950+chocolatenum*3400+nachonum*8710));;
            }
        });
        up3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nachonum++;
                numLab3.setText(String.valueOf(nachonum));
                sumNumLab.setText(String.valueOf(cokenum*1950+chocolatenum*3400+nachonum*8710));
            }
        });
        down3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nachonum--;
                if(nachonum<=0) nachonum = 0;
                numLab3.setText(String.valueOf(nachonum));
                sumNumLab.setText(String.valueOf(cokenum*1950+chocolatenum*3400+nachonum*8710));
            }
        });
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myMoney =  Integer.parseInt(giveTxt.getText());
                int exchange = myMoney - (cokenum*1950+chocolatenum*3400+nachonum*8710);

                for(int i=0;i<8;i++){
                    if(exchange >= 10000){
                        jandon=exchange/10000;
                        change1.setText(String.valueOf(jandon));
                        exchange -= jandon*10000;
                        jandon=0;
                    }
                    else if(exchange >= 5000){
                        jandon=exchange/5000;
                        change2.setText(String.valueOf(jandon));
                        exchange -= jandon*5000;
                        jandon=0;
                    }
                    else if(exchange >= 1000){
                        jandon=exchange/1000;
                        change3.setText(String.valueOf(jandon));
                        exchange -= jandon*1000;
                        jandon=0;
                    }
                    else if(exchange >= 500){
                        jandon=exchange/500;
                        change4.setText(String.valueOf(jandon));
                        exchange -= jandon*500;
                        jandon=0;
                    }
                    else if(exchange >= 100){
                        jandon=exchange/100;
                        change5.setText(String.valueOf(jandon));
                        exchange -= jandon*100;
                        jandon=0;
                    }
                    else if(exchange >= 50){
                        jandon=exchange/50;
                        change6.setText(String.valueOf(jandon));
                        exchange -= jandon*50;
                        jandon=0;
                    }
                    else if(exchange >= 10){
                        jandon=exchange/10;
                        change7.setText(String.valueOf(jandon));
                        exchange -= jandon*10;
                        jandon=0;
                    }
                }

            }
        });
    }

    int man,ohchun,chun,ohbaek,baek,ohsib,sib =0;




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


