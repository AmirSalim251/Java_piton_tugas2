/*
* Nama :Amir Salim
* NPM : 140810210015
* Kelas : A
* Tanggal : 9 September 2022
* Nama Program : Soal4.java
* Deskripsi : Program perpangkatan
*/
import java.util.Scanner;
public class Soal5 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      int angka,pangkat,hf,hw,hdw; 

      angka=inputAngka();
      pangkat=inputPangkat();

      hf=hasilPangkatFor(angka, pangkat);
      hw=hasilPangkatWhile(angka, pangkat);
      hdw=hasilPangkatDoWhile(angka, pangkat);

      outputProg(hf, hw, hdw);

     
    }

    static int inputAngka(){
        System.out.println("\n--- Input Angka ---");
        int hasil;
        System.out.print("Masukkan angka : ");
        hasil=input.nextInt();

        return hasil;
        
    }

    static int inputPangkat(){
        System.out.println("\n--- Input Pangkat ---");
        int hasil;
        System.out.print("Masukkan pangkat : ");
        hasil=input.nextInt();

        return hasil;
        
    }

    static int hasilPangkatFor(int angka,int pangkat){
        System.out.println("\n--- Menghitung hasil pangkat menggunakan for-loop ---");
        int hasil=1;

       
            for(int i=1;i<=pangkat;i++){
                hasil*=angka;
            }
        
        return hasil;
    }

    static int hasilPangkatWhile(int angka,int pangkat){
        System.out.println("\n--- Menghitung hasil pangkat menggunakan while-loop ---");
        int hasil=1,i=1;

        
            while(i<=pangkat){

                hasil*=angka;
                i++;

            }
        
        return hasil;

       
    }

    static int hasilPangkatDoWhile(int angka,int pangkat){
        System.out.println("\n--- Menghitung hasil pangkat menggunakan do while-loop ---");
        int hasil=1,i=1;

        if(pangkat !=0){

       
            do{
                
                hasil*=angka;
                i++;

            }while(i<=pangkat);
        }
        
        return hasil;
       
    }

    static void outputProg(int h1,int h2, int h3){
        System.out.println("\n--- Output Program---");
        System.out.println("Hasil pangkat menggunakan for-loop = " + h1);
        System.out.println("Hasil pangkat menggunakan while-loop = " + h2);
        System.out.println("Hasil pangkat menggunakan do while-loop = " + h3);

    }
    
}
