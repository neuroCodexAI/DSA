// Print revers string like "abcd" change into "dcba"
public class ReversString {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        int idx = str.length();
        printRev(str, idx);
    }
}
