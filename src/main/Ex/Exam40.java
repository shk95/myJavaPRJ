import javax.swing.*;
import java.awt.*;

public class Exam40 {
    static class MyGUI extends JFrame implements Runnable {
        JProgressBar bar1, bar2, bar3;

        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("스레드 응용");

            this.setLayout(new GridLayout(3, 1, 10, 10));

            bar1 = new JProgressBar();
            bar1.setValue(50);//초기값
            bar1.setStringPainted(true);
            bar2 = new JProgressBar();
            bar2.setValue(10);//초기값
            bar2.setForeground(Color.RED);
            bar2.setStringPainted(true);
            bar3 = new JProgressBar();
            bar3.setValue(30);//초기값
            bar2.setForeground(Color.GREEN);
            bar3.setStringPainted(true);

            MyGUI.this.add(bar1);
            MyGUI.this.add(bar2);
            MyGUI.this.add(bar3);
            setSize(512, 256);
            setVisible(true);

//            run();
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                    bar1.setValue(bar1.getValue() + 1);
                    bar2.setValue(bar2.getValue() + 2);
                    bar3.setValue(bar3.getValue() + 3);
                } catch (Exception ignored) {
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //new MyGUI();
        MyGUI mygui = new MyGUI();
        Thread th = new Thread(mygui);
        th.start();
    }
}
