// print tower of hanoi and how to transfer
public class Hanoi {
    public static void towerofHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerofHanoi(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, "S", "H", "D");
    }

}
