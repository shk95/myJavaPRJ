import javax.swing.*;
import java.awt.*;

public class Ex_13_10 {
    static class MyGUI_10 extends JFrame{
        MyGUI_10(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("컴포넌트 연습 4");

            this.setLayout(new FlowLayout());

            String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지"};

            JList list = new JList(pet);
            this.add(list);

            JComboBox combo = new JComboBox(pet);
            this.add(combo);

            setSize(200, 300);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI_10();
    }
}
