public class AddWithoutPlus {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b; // Calculate the carry
            a = a ^ b; // Sum of bits where at least one is not set
            b = carry << 1; // Carry is shifted by one so that it can be added in the next iteration
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 32;
        int result = add(num1, num2);
        System.out.println("Sum: " + result);
    }
}
