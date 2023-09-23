import java.util.Scanner;

public class VolumeBalok {
    public static void main(String[] args) {
        int volume, p, l, t;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tMenghitung Volume Balok");
        System.out.print("masukkan panjang balok: ");
        p = keyboard.nextInt();
        System.out.print("masukkan lebar kubus: ");
        l = keyboard.nextInt();
        System.out.print("masukkan tinggi balok: ");
        t = keyboard.nextInt();
        keyboard.close();

        volume = p * l * t;
        System.out.println("Volume balok adalah " + volume + " cm3");
    }
}
