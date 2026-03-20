package BinaryTreeImplementations.recursion;

public class ReverseString {
    static void reverseString(String str,int i){
        if(i==str.length()) return;
        reverseString(str,i+1);
        System.out.print(str.charAt(i));
    }

    public static void main(String[] args) {
        reverseString("anand",0);
    }
}
