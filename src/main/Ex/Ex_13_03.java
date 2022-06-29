import java.awt.*;
import javax.swing.*;
public class Ex_13_03 {
    static class MyGUI_3 extends JFrame{
        MyGUI_3(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("BorderLayout 연습");

            this.setLayout(new BorderLayout(10, 10));

            JButton btn1 = new JButton("버튼1");
            this.add(btn1, BorderLayout.NORTH);

            JButton btn2 = new JButton("버튼2");
            this.add(btn2, BorderLayout.WEST);

            JButton btn3 = new JButton("버튼3");
            this.add(btn3, BorderLayout.CENTER);

            JButton btn4 = new JButton("버튼4");
            this.add(btn4, BorderLayout.EAST);

            JButton btn5 = new JButton("버튼5");
            this.add(btn5, BorderLayout.SOUTH);

            setSize(256, 256);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI_3();
    }
}
