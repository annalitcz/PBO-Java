import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String args[]) {
        double luas, r;
        // inisialisasi scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.print("masukkan Jari-Jari: ");
        // mengambil data input dengan scanner
        r = keyboard.nextDouble();
        keyboard.close();
        // rumus Luas Lingkaran
        luas = Math.PI * Math.pow(r, 2);
        // format output
        String formattedLuas = String.format("%.2f", luas);
        System.out.println("Luas lingkaran dengan jari-jari " + r + ": " + formattedLuas + " cm");
    }
}
/*
 * Nama: Mohammmad Annan Makruf Mustofa
 * NPM: 2113030041
 * kelas: Sistem Informasi 3D
 * Matkul: PBO
 */