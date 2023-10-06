import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        // tempat masukan data
        Scanner input = new Scanner(System.in);

        System.out.println("===== Masukkan Data Nilai Mahasiswa =====");

        System.out.println("NAMA :");
        String nama = input.nextLine();

        System.out.println("NIM :");
        int nim = input.nextInt();

        System.out.println("NILAI TUGAS :");
        double nilaiTugas = input.nextDouble();

        System.out.println("NILAI UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.println("NILAI UAS : ");
        double nilaiUAS = input.nextDouble();

        System.out.println("\033[H\033[2J");
        System.out.flush();

        input.close();

        double nilaiAkhir = nilaiTugas * 30/100 + nilaiUTS * 30/100 + nilaiUAS * 40/100;

        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("===== SEMANGAT BELAJAR ======");

        if (nilaiAkhir >= 60) {
            System.out.println(nama + " LULUS");
        } else {
            System.out.println(nama + " TIDAK LULUS");
        }
    } 
}
