import javax.swing.*;
import java.awt.*;

public class Ex_13_09 {
    static class MyGUI_9 extends JFrame {
        MyGUI_9() {
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("컴포넌트 연습 3");

            this.setLayout(new FlowLayout());

            JTextField txt1 = new JTextField(10);//열 크기 10
            this.add(txt1);

            JTextArea txt2 = new JTextArea(5, 10);//row 5 col 10
            this.add(txt2);
            this.add(new JScrollPane(txt2));

            JPasswordField txt3 = new JPasswordField(10);
            this.add(txt3);

            setSize(200, 300);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI_9();
    }
}
