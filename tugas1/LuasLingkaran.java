import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        double luas, r;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tMenghitung Luas Lingkaran");
        System.out.print("masukkan Jari-Jari: ");
        r = keyboard.nextDouble();
        keyboard.close();

        luas = Math.PI * Math.pow(r, 2);

        String formatLuas = String.format("%.2f", luas);
        System.out.println("Luas lingkaran adalah " + formatLuas + " cm2");
    }
}
/*
 * Nama: Mohammmad Annan Makruf Mustofa
 * NPM: 2113030041
 * kelas: Sistem Informasi 3D
 * Matkul: PBO
 */
