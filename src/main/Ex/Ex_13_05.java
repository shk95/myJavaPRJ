import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;

public class Ex_13_05 {
    static class MyGUI_5 extends JFrame{
        MyGUI_5(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("CardLayout 연습");

            this.setLayout(new CardLayout(10, 10));

            JButton btn1 = new JButton("버튼1");
            this.add(btn1);

            JButton btn2 = new JButton("버튼2");
            this.add(btn2);

            JButton btn3 = new JButton("버튼3");
            this.add(btn3);

            setSize(256, 256);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI_5();
    }
}
