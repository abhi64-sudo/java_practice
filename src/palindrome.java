import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");

        String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("ygaugauc");
        } else {
            System.out.println("mot");

        }
    }
}