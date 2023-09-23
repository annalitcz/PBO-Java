import java.util.Scanner;

public class LuasKubus {
    public static void main(String[] args) {
        double luas, s;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tMenghitung Luas Kubus");
        System.out.print("Masukkan Panjang sisi: ");
        s = keyboard.nextFloat();
        keyboard.close();

        luas = 6 * Math.pow(s, 2);
        String formatLuas = String.format("%.2f", luas);
        System.out.println("Luas kubus adalah " + formatLuas + " cm2");
    }
}
/*
 * Nama: Mohammmad Annan Makruf Mustofa
 * NPM: 2113030041
 * kelas: Sistem Informasi 3D
 * Matkul: PBO
 */