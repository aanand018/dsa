package BinaryTreeImplementations.recursion;

public class Recursion2 {
    static void fun(int n){
        if(n==0) return;
        System.out.println("BEFORE : "+n);
        fun(n-1);
        System.out.println("AFTER : "+n); // waiting

    }
    public static void main(String[] args) {
    fun(2);
    }
}

/*
OUTPUT :
"C:\Program Files\Java\jdk-22\bin\java.exe" --enable-preview "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.1\lib\idea_rt.jar=51174:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\dsa\out\production\dsa BinaryTreeImplementations.recursion.Recursion2
BEFORE : 5
BEFORE : 4
BEFORE : 3
BEFORE : 2
BEFORE : 1
AFTER : 1
AFTER : 2
AFTER : 3
AFTER : 4
AFTER : 5

Process finished with exit code 0

 */
