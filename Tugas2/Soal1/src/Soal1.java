/*
* Nama :Amir Salim
* NPM : 140810210015
* Kelas : A
* Tanggal : 9 September 2022
* Nama Program : Soal1.java
* Deskripsi : Mencari nilai akhir , mutu nilai , dan kriteria lulus mahasiswa
*/
import java.util.Scanner;
public class Soal1 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String npm,nama,krit;
        char hm;
        int nilai1,nilai2,nilai3,nilaiF;
        
        
        npm=inputNpm();
        nama=inputNama();

       nilai1=inputNilai();
       nilai2=inputNilai();
       nilai3=inputNilai();

       nilaiF= cariNilaiAkhir(nilai1, nilai2, nilai3);
       hm=cariHurufMutu(nilaiF);
       krit=cariLulusTidak(nilaiF);

       printDataMahasiswa(npm, nama, nilaiF, hm, krit);
       input.close();
        

        
    }
    static String inputNpm(){
        System.out.println("\n--- Input NPM ---");
        String baru;
        System.out.print("NPM : ");
        baru=input.nextLine();
        return baru;
        
       
    }

    static String inputNama(){
        System.out.println("\n--- Input Nama ---");
        String baru;
        System.out.print("Nama : ");
        baru=input.nextLine();
        return baru;
        
       
    }

    static int cariNilaiAkhir(int n1,int n2,int n3){
        System.out.println("\n--- Proses mencari nilai Akhir ---");
        return (n1+n2+n3)/3;
    }

    static int inputNilai(){
        System.out.println("\n--- Input Nilai ---");
        int baru;
        System.out.print("Nilai : ");
        baru=input.nextInt();
        return baru;
        
       
    }

    static char cariHurufMutu(int nilaiFinal){
        System.out.println("\n--- Proses mencari huruf mutu ---");
        char hm = ' ';

        if(nilaiFinal>=0 && nilaiFinal<45){
            hm='E';
        }

        else if(nilaiFinal>=45 && nilaiFinal<55){
            hm='D';
        }

        else if(nilaiFinal>=55 && nilaiFinal<68){
            hm='C';
        }

        else if(nilaiFinal>=68 && nilaiFinal<80){
            hm='B';
        }

        else if(nilaiFinal>=80 && nilaiFinal<=100){
            hm='A';
        }

        return hm;
    }

    static String cariLulusTidak(int nilaiFinal){
        System.out.println("\n--- Proses mencari kriteria lulus/tidak ---");
        String krit = " ";

        if(nilaiFinal<55){
        krit="Gagal";
    }
    else{
        krit="Lulus";
    }

        return krit;
    }

    static void printDataMahasiswa(String npm,String nama,int nilaiF,char hm,String kr){
        System.out.println("\n--- Output Data Mahasiswa ---");
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai akhir : " + nilaiF);
        System.out.println("Huruf Mutu : " + hm);
        System.out.println("Kriteria Lulus : " + kr);
    }
}
