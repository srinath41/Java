import java.util.Scanner;

public class Word2Pattern {
    public static void printRow(char a, int row) {
        int n = 7;
        for (int j = 0; j < n; j++) {
            if (a == 'A') {
                if (row == 0 || j == 0 || row == n / 2 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'B') {
                if (row == 0 || (j == 0 && j != n - 1) || (row == n / 2 && j != n / 2) || (j == n - 1 && j != n / 2) || (j == n - 1 && row != 0 && row != n / 2 && row != n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'C') {
                if ((row == 0 && j > 0) || (j == 0 && row != 0 && row != n - 1) || (row == n - 1 && j > 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'D') {
                if (j == 0 || (row == 0 && j < n - 1) || (row == n - 1 && j < n - 1) || (j == n - 1 && row > 0 && row < n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'E') {
                if (row == 0 || row == n / 2 || row == n - 1 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'F') {
                if (row == 0 || row == n / 2 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'G') {
                if (row == 0 || row == n - 1 || j == 0 || (row == n / 2 && j >= n / 2) || (j == n - 1 && row >= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'H') {
                if (j == 0 || j == n - 1 || row == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'I') {
                if (row == 0 || row == n - 1 || j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'J') {
                if (row == 0 || (j == n / 2 && row < n - 1) || (row == n - 1 && j < n / 2) || (j == 0 && row >= n - 1 - n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'K') {
                if (j == 0 || (row + j == n / 2) || (row - j == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'L') {
                if (row == n - 1 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'M') {
                if (j == 0 || j == n - 1 || (row == j && row <= n / 2) || (row + j == n - 1 && row <= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'N') {
                if (j == 0 || j == n - 1 || row == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'O') {
                if (row == 0 || row == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'P') {
                if (j == 0 || (row == 0 && j < n - 1) || (row == n / 2 && j < n - 1) || (j == n - 1 && row < n / 2 && row != 0 && row != n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'Q') {
                if (row == 0 || row == n - 1 || j == 0 || j == n - 1 || (row == j && row >= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'R') {
                if (j == 0 || (row == 0 && j < n - 1) || (row == n / 2 && j < n - 1) || (j == n - 1 && row > 0 && row < n / 2) || (row > n / 2 && row == j)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'S') {
                if (row == 0 || row == n / 2 || row == n - 1 || (j == 0 && row < n / 2) || (j == n - 1 && row > n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'T') {
                if (row == 0 || j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'U') {
                if ((j == 0 && row < n - 1) || (j == n - 1 && row < n - 1) || (row == n - 1 && j > 0 && j < n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'V') {
                if ((j == 0 && row < n - 1) || (j == n - 1 && row < n - 1) || (row == n - 1 && j > 0 && j < n - 1) || (row == j && row >= n / 2) || (row + j == n - 1 && row >= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'W') {
                if (j == 0 || j == n - 1 || (row == j && row >= n / 2) || (row + j == n - 1 && row >= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'X') {
                if (row == j || row + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'Y') {
                if ((row == j && row < n / 2) || (row + j == n - 1 && row < n / 2) || (j == n / 2 && row >= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else if (a == 'Z') {
                if (row == 0 || row == n - 1 || row + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } else {
                System.out.print("  ");
            }
        }
        System.out.print("  ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();

        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < s.length(); k++) {
                printRow(s.charAt(k), i);
            }
            System.out.println();
        }
    }
}