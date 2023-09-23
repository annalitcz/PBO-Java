import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        double Luas, alas, tinggi;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\tMenghitung Luas Segitiga");
        System.out.print("Masukkan panjang alas: ");
        alas = keyboard.nextDouble();
        System.out.print("Masukkan Tinggi: ");
        tinggi = keyboard.nextDouble();
        keyboard.close();

        Luas = (alas * tinggi) / 2;

        String formatLuas = String.format("%.2f", Luas);
        System.out.println("Luas segitiga adalah " + formatLuas + "cm2");
    }
}
/*
 * Nama: Mohammmad Annan Makruf Mustofa
 * NPM: 2113030041
 * kelas: Sistem Informasi 3D
 * Matkul: PBO
 */