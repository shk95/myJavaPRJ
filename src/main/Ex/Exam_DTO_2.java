public class Exam_DTO_2 {
    public static void main(String[] args) {
        Exam_DTO_1 eDTO = new Exam_DTO_1();

        eDTO.setTest("기말고사");
        eDTO.setScore(100);
        System.out.println("시험 : "+eDTO.getTest());
        System.out.println("점수 : "+eDTO.getScore());
    }
}

