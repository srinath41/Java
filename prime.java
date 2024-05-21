import java.util.Scanner;

class prime {
	public static void main(String[] args) {
		int n, i, flag, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("m:");
		m = sc.nextInt();
		for (n = 2; n < m; n++) {
			flag = 0;
			for (i = 1; i <= (n / 2); i++) {
				if (n % i == 0) {
					flag++;
				}

			}
			if (flag == 1) {
				System.out.println(n);
			}
		}
	}
	class b
	}
	}
}