package BinaryTreeImplementations.recursion;

public class Count_Digits {
    public static void main(String[] args) {
        System.out.println(digits(123));
    }

    private static int digits(int i) {
        if (i == 0) return 0;
        return 1 + digits(i/10);
    }
}
