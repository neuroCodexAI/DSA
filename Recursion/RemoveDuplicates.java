//Remove duplicates in a string
public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicatesString(String str, String newStr, int idx) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicatesString(str, newStr, idx + 1);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicatesString(str, newStr, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "abbcddax";
        removeDuplicatesString(str, "", 0);
    }
}
