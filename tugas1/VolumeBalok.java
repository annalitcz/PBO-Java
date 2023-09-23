import java.util.Scanner;

public class VolumeBalok {
    public static void main(String[] args) {
        int volume, p, l, t;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tMenghitung Volume Balok");
        System.out.print("masukkan panjang: ");
        p = keyboard.nextInt();
        System.out.print("masukkan lebar: ");
        l = keyboard.nextInt();
        System.out.print("masukkan tinggi: ");
        t = keyboard.nextInt();
        keyboard.close();

        volume = p * l * t;
        System.out.println("Volume balok adalah " + volume + " cm3");
    }
}
/*
 * Nama: Mohammmad Annan Makruf Mustofa
 * NPM: 2113030041
 * kelas: Sistem Informasi 3D
 * Matkul: PBO
 */
