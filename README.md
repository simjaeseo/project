## Project 보고


#### 프로젝트 결과
<p style="text-align:center;">
    <img align="center" width="" alt="on" src="https://user-images.githubusercontent.com/63089631/80308293-21b7d380-8809-11ea-86f0-42880902faad.PNG">
</p>

<br>

### gui form을 이용한 swing 구현


~~~
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
    private void createUIComponents() {
        imgLab1 = new JLabel(new ImageIcon("coke.jpg"));
        imgLab2 = new JLabel(new ImageIcon("chocolate.jpg"));
        imgLab3 = new JLabel(new ImageIcon("nacho.jpg"));
    }
    
~~~


- gui form을 이용하여 만들어보았습니다. 다만, 각각의 패널과 레이블등은 자동적으로 정의가 되었지만 각각의 속성들은 자동적으로 소스로 변환이 안되는것으로 보아 .form 파일에 정보가 담겨있을것이라고 추측했습니다.

<br>

### event와 알고리즘 구현


~~~
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

~~~

- ActionListener의 기본 골격은 gui form에서 create istener 기능을 이용하니 자동적으로 생성되었고, 나머지는 코딩하였습니다.
- 잔돈계산 알고리즘은 단순히 큰 지폐부터 거슬러주게 만들어보았습니다.

<br>

### 소감
- 심재서 : 팀프로젝트였지만 팀원들 모두 연락이 두절되어 함께 프로젝트를 진행할 수 없었습니다. 혼자 프로젝트를 진행하면서 많은 어려움이 있었지만 다른 팀인 전진호 학생에게 많은 도움을 받아 마무리할 수 있었습니다. swing이라는 기능을 아예 모르고있었는데 프로젝트를 진행하면서 많은 부분을 공부할 수 있었으며 클릭 시 이벤트가 발생하는 부분도 신기하고 재미있었습니다.
