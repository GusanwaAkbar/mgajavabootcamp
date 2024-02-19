import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Percobaan pertama
        System.out.println("Percobaan pertama");
        System.out.print("(Input) Masukkan Kata: ");
        String kataPertama = scanner.nextLine();
        int hasilPertama = hitungJumlahASCII(kataPertama);
        System.out.println("(Output) Hasil: " + hasilPertama);
        System.out.println();

        // Percobaan kedua
        System.out.println("Percobaan kedua");
        System.out.print("(Input) Masukkan Kata: ");
        String kataKedua = scanner.nextLine();
        int hasilKedua = hitungJumlahASCII(kataKedua);
        System.out.println("(Output) Hasil: " + hasilKedua);

        scanner.close();
    }

    // Fungsi untuk menghitung jumlah nilai ASCII dari setiap karakter dalam kata
    private static int hitungJumlahASCII(String kata) {
        int hasil = 0;

        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            int nilaiASCII = (int) karakter;
            hasil += nilaiASCII;
        }

        return hasil;
    }
}
