import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhap chuoi s
        System.out.println("Nhap chuoi: ");
        String s = scanner.nextLine();

        // a. do dai cua s
        System.out.print("Do dai cua s la: " + s.length());

        // b. xoa bo khoang trang thua cua s
        String sTrimmed = s.trim().replaceAll("\\s+", " ");
        System.out.print("\nChuoi sau khi xoa khoang trang thua: " + sTrimmed);

        // c. dem so tu cua s va xuat moi tu nam tren 1 dong
        String[] words = sTrimmed.split(" ");
        System.out.println("\nSo tu cua chuoi: " + words.length);
        for (String word : words) {
            System.out.println(word);
        }

        // d. nhap so tu nhien k, xuat k ki tu ben trai cua s, k ki tu ben phai cua s
        System.out.print("Nhap so tu nhien k: ");
        int k = scanner.nextInt();
        scanner.nextLine();
        if (k <= s.length()) {
            System.out.println("Ky tu ben trai: " + s.substring(0, k));
            System.out.println("Ky tu ben phai: " + s.substring(s.length() - k));
        } else {
            System.out.println("k lon hon do dai chuoi.");
        }
        
        // e. nhap so tu nhien k, n, xuat n ki tu cua s ker tu vi tri k
        System.out.println("Bat dau tu vi tri k: " );
        int star = scanner.nextInt();
        System.out.print("Nhap so ky tu n: ");
        int n = scanner.nextInt();

        if (star >= 0 && k <= s.length()) {
            if (star + n <= s.length()) {
                System.out.println("Chuoi tu ky tu " + star + ": " + s.substring(star, star + n));
            } else {
                // neu chieu dai vuot qua ky tu chuoi, lay tu ky tu k den cuoi chuoi
                System.out.println("Chuoi tu ky tu " + star + ": " + s.substring(star));
            }
        } else {
            System.out.println("Gia tri k hoac n khong hop le.");
        }
    }
}
