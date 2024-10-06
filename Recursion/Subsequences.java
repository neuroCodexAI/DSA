import java.util.HashSet;

//Print all subsequences of a string
public class Subsequences {

    public static void subSequencesPrint(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        subSequencesPrint(str, idx + 1, newStr + currChar);
        subSequencesPrint(str, idx + 1, newStr);

    }

    // Print all the unique subsequence of a string
    public static void uniqueSubsequence(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqueSubsequence(str, idx + 1, newStr + currChar, set);
        uniqueSubsequence(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        // subSequencesPrint(str, 0, "");
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "", set);
    }
}
