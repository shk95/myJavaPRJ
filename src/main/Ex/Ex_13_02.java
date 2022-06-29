import java.awt.*;
import javax.swing.*;
public class Ex_13_02 {
    static class MyGUI_2 extends JFrame{
        MyGUI_2(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("FlowLayout 연습");

//            this.setLayout(new FlowLayout()); 파라미터생략시 기본 CENTER
            this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

            JButton btn1 = new JButton("버튼 1");
            this.add(btn1);

            JButton btn2 = new JButton("버튼 2");
            this.add(btn2);

            JButton btn3 = new JButton("버튼 3");
            this.add(btn3);

            JButton btn4 = new JButton("버튼 4");
            this.add(btn4);

            JButton btn5 = new JButton("버튼 5");
            this.add(btn5);

            setSize(256, 256);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI_2();
    }
}
