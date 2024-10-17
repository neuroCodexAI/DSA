// count total paths in a maze from (0,0) to (n,m)
public class MazePath {
    public static int mazeCount(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downWord = mazeCount(i + 1, j, n, m);
        int forWord = mazeCount(i, j + 1, n, m);
        return downWord + forWord;
    }

    public static void main(String[] args) {
        System.out.println(mazeCount(0, 0, 3, 3));
    }
}
