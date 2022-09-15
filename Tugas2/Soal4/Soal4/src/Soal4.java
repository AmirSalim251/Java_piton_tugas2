/*
* Nama :Amir Salim
* NPM : 140810210015
* Kelas : A
* Tanggal : 9 September 2022
* Nama Program : Soal4.java
* Deskripsi : Cetak bintang bentuk segitiga
*/

import java.util.Scanner;
public class Soal4 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int baris;

        baris=inputBaris();

        segitigaFor(baris);
        segitigaWhile(baris);
        segitigaTerbalikFor(baris);
        segitigaTerbalikWhile(baris);
    }

    static int inputBaris(){
        int hasil;
        System.out.println("\n--- Input Jumlah Baris ---");
        System.out.print("Jumlah Baris : ");
        hasil=input.nextInt();

        return hasil;

    }
    static void segitigaFor(int baris){
        System.out.println("\n--- Segitiga menggunakan for ---");
        for(int i=1;i<=baris;i++){    
            System.out.print(i+" . ");
            for(int j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    static void segitigaWhile(int baris){
        System.out.println("\n--- Segitiga menggunakan while ---");
        int i=1,j=1;

        while(i<=baris){
            System.out.print(i +" . ");
            while(j<=i){
            System.out.print(" * ");  
            j++;

            }
        System.out.println();
        i++;
        j=1;
        }
    }
    static void segitigaTerbalikFor(int baris){
        System.out.println("\n--- Segitiga terbalik menggunakan for ---");
        for(int i=baris;i>=1;i--){

            
            System.out.print((baris - i+1)+" . ");
            for(int j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    static void segitigaTerbalikWhile(int baris){
        System.out.println("\n--- Segitiga terbalik menggunakan while ---");
        int i=baris,j=1;

        while(i>=1){
            System.out.print((baris - i+1)+" . ");
            while(j<=i){
            System.out.print(" * ");  
            j++;

            }
        System.out.println();
        i--;
        j=1;
        }
    }
}
