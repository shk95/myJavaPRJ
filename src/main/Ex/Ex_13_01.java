import javax.swing.JFrame;
public class Ex_13_01 {
    public static class MyGUI_1 extends JFrame{
        MyGUI_1(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setTitle("GUI 연습");

            //버튼 레이블 등 부분

            setSize(500,500);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI_1();
    }
}
