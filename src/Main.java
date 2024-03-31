//Trong toán học, nếu số nguyên a chia hết cho số nguyên b
// thì số b được gọi là ước của số nguyên a,
// a được gọi là bội của b. Số nguyên dương b lớn nhất là ước của cả hai
// số nguyên a, b được gọi là ước số chung lớn nhất (ƯCLN) của a và b.
// Trong trường hợp cả hai số nguyên a và b đều bằng 0 thì chúng không có
// ƯCLN vì khi đó mọi số tự nhiên khác không đều là ước chung của a và b.
// Nếu chỉ một trong hai số a hoặc b bằng 0, số kia khác 0 thì ƯCLN của
// chúng bằng giá trị tuyệt đối của số khác 0.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}


