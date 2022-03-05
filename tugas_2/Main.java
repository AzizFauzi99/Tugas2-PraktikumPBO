package tugas_2;

import java.util.Scanner;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, ulangi;
        double tinggi, jari, panjang, lebar;
        
        do{
            System.out.println("==========");
            System.out.println("MENU UTAMA");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            if(pilih == 1){
                System.out.print("Input Panjang : ");
                panjang = input.nextDouble();
                System.out.print("Input Lebar   : ");
                lebar = input.nextDouble();
                System.out.print("Input Tinggi  : ");
                tinggi = input.nextDouble();

                // Intansiasi PersegiPanjang & Set panjang dan lebarnya
                PersegiPanjang PersegiPanjang = new PersegiPanjang(panjang, lebar);
                PersegiPanjang.setPanjang(panjang);
                PersegiPanjang.setLebar(lebar);
                // Instansiasi balok & set panjang, lebar dan tingginya
                Balok balok = new Balok(panjang, lebar, tinggi);
                balok.setPanjang(panjang);
                balok.setLebar(lebar);
                balok.setTinggi(tinggi);            
                
                System.out.println("Luas Persegi Panjang        = " + PersegiPanjang.luas());
                System.out.println("Keliling Persegi Panjang    = " + PersegiPanjang.keliling());
                System.out.println("Volume Balok                = " + balok.volume());
                System.out.println("Luas Permukaan Balok        = " + balok.luasPermukaan());
            }else if(pilih == 2){
                System.out.print("Input Tinggi    : ");
                tinggi = input.nextDouble();
                System.out.print("Input Jari-Jari : ");
                jari = input.nextDouble();
                
                //Instansiasi lingkaran & set nilai
                Lingkaran lingkaran = new Lingkaran(jari);
                lingkaran.setJari(jari);
                
                // Instansiasi tabung & set nilai
                Tabung tabung = new Tabung(tinggi, jari);
                tabung.setTinggi(tinggi);
                tabung.setJari(jari);
                
                System.out.println("Luas Lingkaran        = " + lingkaran.luas());
                System.out.println("Keliling Lingkaran    = " + lingkaran.keliling());
                System.out.println("Volume Tabung         = " + tabung.volume());
                System.out.println("Luas Permukaan Tabung = " + tabung.luasPermukaan());
            }else if(pilih == 0){
                break;
            }else{
                System.out.println("Masukkan Anda Salah, Silahkan Ulangi Lagi!!!");
            }
            
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0) ");
            ulangi = input.nextInt();
            
        }while(ulangi == 1);
    }
}
