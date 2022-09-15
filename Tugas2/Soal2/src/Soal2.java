/*
* Nama :Amir Salim
* NPM : 140810210015
* Kelas : A
* Tanggal : 9 September 2022
* Nama Program : Soal2.java
* Deskripsi : Print huruf sesuai angka yang diinput
*/

import java.util.Scanner;
public class Soal2 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int nilai;
        String hasilIfElse,hasilSwitch;

        nilai=inputAngka();
        hasilIfElse=bilIfElse(nilai);
        hasilSwitch=bilSwitch(nilai);

        outputProg(nilai, hasilIfElse, hasilSwitch);

        input.close();
        


    }

    static int inputAngka(){
        System.out.println("\n--- Input Nilai ---");
        int hasil;
        System.out.println("Masukkan bilangan...");
        hasil=input.nextInt();

        return hasil;


    }

    static String bilIfElse(int nil){
        System.out.println("\n--- Proses mengunakan if-else ---");
        String hasil = " ";

        if(nil==1){
            hasil="Satu";
        }

        else if(nil==2){
            hasil="Dua";
        }

        else if(nil==3){
            hasil="Tiga";
        }

        else if(nil==4){
            hasil="Empat";
        }

        else if(nil==5){
            hasil="Lima";
        }

        else if(nil==6){
            hasil="Enam";
        }

        else if(nil==7){
            hasil="Tujuh";
        }

        else if(nil==8){
            hasil="Delapan";
        }

        else if(nil==9){
            hasil="Sembilan";
        }

        else if(nil==10){
            hasil="Sepuluh";
        }
        else{
            hasil="Invalid Number";
        }


        return hasil;
        
    }

    static String bilSwitch(int nil){
        System.out.println("\n--- Proses menggunkan switch ---");
        String hasil = " ";
        switch(nil){
            case 1:
                hasil="Satu";
                break;
            case 2:
                hasil="Dua";
                break;
            case 3:
                hasil="Tiga";
                break;
            case 4:
                hasil="Empat";
                break;
            case 5:
                hasil="Lima";
                break;
            case 6:
                hasil="Enam";
                break;
            case 7:
                hasil="Tujuh";
                break;
            case 8:
                hasil="Delapan";
                break;
            case 9:
                hasil="Sembilan";
                break;
            case 10:
                hasil="Sepuluh";
                break;
            default:
                hasil="Invalid Number";
                break;
        }
        return hasil;
    }

    static void outputProg(int nil,String s1,String s2){
        System.out.println("\n--- Output Program ---");
        System.out.println("Bilangan : " + nil);
        System.out.println("Hasil menggunakan if-else : " +s1);
        System.out.println("Hasil menggunakan switch : " +s2);
    }
}
