public class test {
    public static void main(String[] args) {
        int[][] a = new int[3][4];

        int b = a.length;
        int c = a[0].length;
        System.out.println(b+" "+c);
        String s1 = "djflsdflkdjkflj jdflsdjfklsdjfkl klsdjflksdjfklsdjkfl";
        String[] s2 = s1.split(" ");
        System.out.println(s2[0].substring(2,4));

    }
}
