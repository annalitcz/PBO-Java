import java.util.Scanner;

public class VolumeKerucut {
    public static void main(String[] args) {
        double volume, r, h;

        System.out.println("\tMenghitung Volume Kerucut");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        r = keyboard.nextDouble();
        System.out.print("Masukkan tinggi: ");
        h = keyboard.nextDouble();
        keyboard.close();

        volume = Math.PI * Math.pow(r, 2) * (h / 3);
        String formatVolume = String.format("%.2f", volume);
        System.out.println("Volume kerucut adalah " + formatVolume + " cm3");
    }
}
