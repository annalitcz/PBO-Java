import java.util.Scanner;

public class LuasKubus {
    public static void main(String[] args) {
        double luas, s;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Panjang sisi: ");
        s = keyboard.nextFloat();
        keyboard.close();

        luas = 6 * Math.pow(s, 2);
        String formattedLuas = String.format("%.2f", luas);
        System.out.println("luas segitiga adalah " + formattedLuas + "cm");
    }
}
/*
 * Nama: Mohammmad Annan Makruf Mustofa
 * NPM: 2113030041
 * kelas: Sistem Informasi 3D
 * Matkul: PBO
 */