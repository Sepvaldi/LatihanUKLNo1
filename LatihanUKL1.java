//Sebuah perusahaan ekspedisi ternama mengirimkan paket-paket ke berbagai daerah. Biaya pengiriman tergantung pada berat paket, jarak tempuh serta volume barang..
//Berikut adalah detail biaya pengiriman per kilogram:
//Jarak kurang dari atau sama dengan 10 km: Rp 4250 per kg
//Jarak lebih dari 10 km: Rp 6000 per kg
//Volume paket akan dikenakan biaya Rp 50.000,- ketika volume melebihi 100 cm^3. 

//Buatlah sebuah program dalam bahasa Java untuk menghitung biaya total pengiriman berdasarkan 
//berat paket jarak tempuh serta volume barang yang diketahui dengan menginputkan panjang, lebar serta tinggi dari paket.

import java.util.Scanner;

public class LatihanUKL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //INPUTAN PENGIRIMAN BARANG
        System.out.println("Masukkan jarak Tempuh (km)");
        int jarak = input.nextInt();
        System.out.println("Masukkan berat");
        int berat = input.nextInt();
        System.out.println("Masukkan panjang barang");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar barang");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi barang");
        int tinggi = input.nextInt();

        //INPUTAN SYSTEM
        double tambahan = 0;
        if (jarak < 10 || jarak == 10) {
            tambahan += 4250 * berat;
        }
        else if (jarak > 10) {
            tambahan += 6000 * berat;
            
        }
        
        double volume = panjang * lebar * tinggi;
        if (volume < 100) {
            tambahan += 50000;
        }

        //INPUTAN HASIL
        double hasil = volume + tambahan;
        System.out.println("TOTAL PENGIRIMAN");
        System.out.println("Total biaya: " + hasil);
    }
    
}
