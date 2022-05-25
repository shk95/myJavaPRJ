public class Ex_09_09 {
    public static void main(String[] args) {
        String str1 = "Java Programing";
        String str2 = "Java Programing";
        String str3 = new String("Java Programing");

        System.out.println("원 문자열 1 ==> [" + str1 + "]");
        System.out.println("원 문자열 2 ==> [" + str2 + "]");
        System.out.println("원 문자열 3 ==> [" + str3 + "]\n");

        System.out.println("문자열 1 ==> 문자열2 결과 : \t" + (str1 == str2));
        System.out.println("문자열 1.equals(문자열2) 결과 : " + (str1.equals(str2)));
        System.out.println("문자열 1 ==> 문자열3 결과 : \t" + (str1 == str3));
        System.out.println("문자열 1.equals(문자열3) 결과 :" + (str1.equals(str3)));

        System.out.println();

        System.out.println("문자열1 과 문자열 2가 다른지 비교 compareTo 안쓰고, 이렇게 함 : " + !str1.equals(str2));


    }
}
