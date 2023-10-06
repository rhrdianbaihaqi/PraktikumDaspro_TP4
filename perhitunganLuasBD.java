import java.util.Scanner;

public class perhitunganLuasBD {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan nomor pilihan: ");

        int pilihan = scanner.nextInt();
        double luas = 0;

        // Menggunakan switch untuk menentukan jenis bangun datar
        switch (pilihan) {
            
        case 1:
        // Persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisiPersegi = scanner.nextDouble();
        luas = sisiPersegi * sisiPersegi;
        break;

        case 2:
        // Segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alasSegitiga = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();
        luas = 0.5 * alasSegitiga * tinggiSegitiga;
        break;

        case 3:
        // Lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        luas = Math.PI * Math.pow(jariJari, 2);
        break;

        default:
        System.out.println("Pilihan tidak valid.");
        // Menutup scanner
        scanner.close();
        return;
        }

        // Menampilkan hasil perhitungan luas
        System.out.println("Luas bangun datar adalah: " + luas);

        // Menutup scanner
        scanner.close();
    }
}

