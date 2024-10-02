//Find the 1st & last occurance of an element in string 
public class OccuranceElement {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length() - 1) {
            return;
        }

        if (str.charAt(idx) == 'a') {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abbachshhbaacdal";
        char element = 'a';
        findOccurance(str, 0, element);
        System.out.println(first + 1 + "  " + (last + 1));
    }
}
