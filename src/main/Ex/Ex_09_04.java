public class Ex_09_04 {
    public static void main(String[] args) {
        String str = "Java 를 공부하는 중. Java 는 재밌어요~~";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 의 위치 ==> ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java 의 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));
    }
}
