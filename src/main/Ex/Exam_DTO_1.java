import lombok.Getter;
import lombok.Setter;

//getter setter
//private 를 외부에서 접근하기위한 함수
@Getter
@Setter
public class Exam_DTO_1 {
    private String test;
    private int score;

   /* public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;//객체의 변수를 가리킴
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }*/
}
