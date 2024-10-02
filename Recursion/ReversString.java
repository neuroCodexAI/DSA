// Print revers string like "abcd" change into "dcba"
public class ReversString {
    public static void printRev(int n, String str) {
        if (n == 0) {
            System.out.println(str.charAt(n));
            return;
        }
        System.out.println(str.charAt(n));
        printRev(n - 1, str);
    }

    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();
        printRev(n - 1, str);
    }
}
