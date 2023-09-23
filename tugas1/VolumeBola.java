import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        double volume, r;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tMenghitung Volume Bola");
        System.out.print("Masukkan Panjang jari-jari: ");
        r = keyboard.nextDouble();
        keyboard.close();

        volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        String formatVolume = String.format("%.2f", volume);
        System.out.println("Volume Bola adalah: " + formatVolume + "cm3");
    }
}
