/*
* Nama :Amir Salim
* NPM : 140810210015
* Kelas : A
* Tanggal : 9 September 2022
* Nama Program : Soal3.java
* Deskripsi : Mencari gaji pegawai dan aturan-aturannya
*/

import java.util.Scanner;
public class Soal3 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nama;
        int gol,potongan,tunjangan;
        long gapok;
        float gatot;

        nama=inputNama();
        gol=inputGol();

        gapok=prosesGapok(gol);
        potongan=prosesPotongan(gol);
        tunjangan=prosesTunjangan(gol);

        gatot=prosesGatot(gapok, tunjangan, potongan);

        outputKaryawan(nama, gol, gapok, tunjangan, potongan, gatot);

        input.close();
    }

    static String inputNama(){
        System.out.println("\n--- Input Nama ---");

        String hasil;
        System.out.print("Nama : ");
        hasil = input.nextLine();

        return hasil;
    }

    
    static int inputGol(){
        System.out.println("\n--- Input Golongan gaji ---");

        int hasil;
        System.out.print("Golongan Gaji : ");
        hasil = input.nextInt();

        return hasil;
    }

    static long prosesGapok(int gol){
        System.out.println("\n--- Proses mencari gaji pokok ---");
        long gapok= 0;
        switch (gol){
            case 1:
                gapok=1500000;
                break;
            case 2:
                gapok=2000000;
                break;
            case 3:
                gapok=3000000;
                break;
            case 4:
                gapok=5000000;
                break;
            default:
                System.out.println("Bukan termasuk golongan gaji! nilai gapok menjadi 0");
                    

        }
        return gapok;
    }

    static int prosesPotongan(int gol){
        System.out.println("\n--- Proses mencari potongan gaji ---");
        int pot= 0;
        switch (gol){
            case 1:
                pot=1;
                break;
            case 2:
                pot=2;
                break;
            case 3:
                pot=2;
                break;
            case 4:
                pot=5;
                break;
            default:
                System.out.println("Bukan termasuk golongan gaji! nilai potongan menjadi 0");
                    

        }
        return pot;
    }

    static int prosesTunjangan(int gol){
        System.out.println("\n--- Proses mencari tunjangan gaji ---");
        int tun= 0;
        switch (gol){
            case 1:
                tun= 10;
                break;
            case 2:
                tun= 12;
                break;
            case 3:
                tun= 12;
                break;
            case 4:
                tun= 15 ;
                break;
            default:
                System.out.println("Bukan termasuk golongan gaji! nilai tunjangan menjadi 0");
                    

        }
        return tun;
    }

    static float prosesGatot(long gapok,int tunjangan,int potongan){
        System.out.println("\n--- Proses mencari gaji total ---");
        return (float)((float)gapok+ ((float)tunjangan/100)-((float)potongan/100));
    }

    static void outputKaryawan(String nama,int gol,long gapok,int tunjangan,int potongan,float gatot){
        System.out.println("\n--- Output Karyawan ---");
        System.out.println("Nama : " + nama);
        System.out.println("Golongan gaji : " + gol);
        System.out.println("Gaji Pokok : " + gapok);
        System.out.println("Tunjangan : " + tunjangan + "%");
        System.out.println("Potongan: " + potongan + "%");
        System.out.println("Gaji Total: " + gatot);
    }

    
}
