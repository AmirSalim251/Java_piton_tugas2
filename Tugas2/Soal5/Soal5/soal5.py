# Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
# NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
# Kelas : A
# Tanggal : 9 September 2022
# Nama Program : soal5.py
# Deskripsi : Program perpangkatan

def inputAngka():
    print("\n--- Input Angka ---")
    angka = int(input("Masukkan Angka : "))
    return angka

def inputPangkat():
    print("\n--- Input Pangkat ---")
    pangkat = int(input("Masukkan Pangkat : "))
    return pangkat

def hasilPangkatFor(angka,pangkat):
    print("\n--- Menghitung hasil pangkat menggunakan for-loop ---")
    hasil = int(1)

    for i in range(1,pangkat+1,1):
        hasil = hasil * angka

    return hasil

def hasilPangkatWhile(angka,pangkat):
    print("\n--- Menghitung hasil pangkat menggunakan while-loop ---")
    i = int(1)
    hasil = int(1)

    while i<=pangkat:
        hasil = hasil * angka
        i = i+1

    return hasil

def hasilPangkatDoWhile(angka,pangkat):
    print("\n--- Menghitung hasil pangkat menggunakan Do while-loop ---")
    i = int(1)
    hasil = int(1)

    if(pangkat!=0):
        while True:
            hasil = hasil * angka
            i = i+1
            if i>pangkat:
                break

    return hasil

def outputProg(f,w,dw):
    print("\n--- Output Program ---")
    print("Hasil pangkat menggunakan for : " , f)
    print("Hasil pangkat menggunakan while : " , w)
    print("Hasil pangkat menggunakan do-while : " , dw)


bil=inputAngka()
n=inputPangkat()

hasilFor=hasilPangkatFor(bil,n)
hasilWhile=hasilPangkatWhile(bil,n)
hasilDoWhile=hasilPangkatDoWhile(bil,n)

outputProg(hasilFor,hasilWhile,hasilDoWhile)
    
