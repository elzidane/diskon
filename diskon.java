import java.util.Scanner;

public class diskon {
     public static void main(String[] args) {
       
       double hargaBarang, diskon;
        int hasil, jumlahBarang;

        Scanner scan =new Scanner(System.in);

        System.out.print("Harga barang: ");
        hargaBarang = scan.nextDouble();

        System.out.print("jumlah barang: ");
        jumlahBarang = scan.nextInt();
        
        System.out.print("Diskon: ");
        diskon = scan.nextDouble();

        diskon = (diskon / 100);

        hasil = (int) ((int) hargaBarang * jumlahBarang * diskon);
        
        System.out.println("Total yang harus dibayar adalah: " + hasil);   
    }
    
}
