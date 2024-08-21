
import java.util.Scanner;

public class gajiKaryawan {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Jumlah jam kerja: ");
        int jamKerja = scan.nextInt();

        System.out.println("Tarif per jam");
        int tarifPerJam = scan.nextInt();

        int gajiAwal = jamKerja * tarifPerJam;
        double potonganPajak = gajiAwal * 0.10;
        double gajiBersih = gajiAwal - potonganPajak;

        System.out.println("Gaji Awal: " + gajiAwal);
        System.out.println("Potongan pajak: " + potonganPajak);
        System.out.println("Gaji berssih: " + gajiBersih);
    }
}
