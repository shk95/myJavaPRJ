import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex_10_09 {
    public static void main(String[] args) throws Exception {
        //1.
        FileInputStream fis = new FileInputStream("C:/Temp/text.txt");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.println(ch);
        }
        fis.close();

        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);//한국어를 처리하기위한것
        int ch1;
        while ((ch1 = isr.read()) != -1) {
            System.out.println(ch1);
        }
        fis.close();

    }
}
