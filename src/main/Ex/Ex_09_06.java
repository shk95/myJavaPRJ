public class Ex_09_06 {
    public static void main(String[] args) {
        String str = " 한글   ABCD  dfdf";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]");

        //9-7 예제 모든 공백 없애기
        System.out.println("전체공백제거 ==> " + str.replaceAll(" ", ""));
    }
}
