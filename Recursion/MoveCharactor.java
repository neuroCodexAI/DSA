//Move all 'x' to the end of the string
public class MoveCharactor {
    public static void moveAllx(String str, String str2, int idx, int count) {
        if (idx == str.length() - 1) {
            for (int i = 0; i <= count; i++) {
                str2 += 'x';
            }
            System.out.println(str2);
            return;
        }
        if (str.charAt(idx) == 'x' || str.charAt(idx) == 'X') {
            count += 1;
            moveAllx(str, str2, idx + 1, count);
        } else {
            str2 += str.charAt(idx);
            moveAllx(str, str2, idx + 1, count);
        }
    }

    public static void main(String[] args) {
        String str = "axxbeescxx";
        moveAllx(str, "", 0, 0);
    }
}
