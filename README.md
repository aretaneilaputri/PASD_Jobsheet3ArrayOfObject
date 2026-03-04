# PASD_Jobsheet3ArrayOfObject

3.2.3 Pertanyaan & Jawaban
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method? Jelaskan! 
Jawaban: Tidak harus.Class boleh hanya punya atribut saja seperti contoh Mahasiswa02 tadi. Method itu tambahan untuk memproses data. Jadi atribut saja sudah cukup untuk dijadikan array of object.
2. Apa yang dilakukan oleh kode program berikut? 
     Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
Jawaban:Kode tersebut membuat sebuah array yang bisa menampung 3 objek bertipe Mahasiswa02.
Lebih detailnya begini:
Mahasiswa02[] → artinya kita membuat array yang isinya nanti berupa object Mahasiswa02.
arrayOfMahasiswa → nama array-nya.
new Mahasiswa02[3] → membuat array dengan ukuran 3 (index 0, 1, dan 2).
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan 
konstruktur pada baris program berikut?
    arrayOfMahasiswa[0] = new Mahasiswa();
Jawaban:Class Mahasiswa02 memang tidak memiliki konstruktor yang dibuat secara eksplisit oleh programmer. Akan tetapi, Java secara otomatis menyediakan konstruktor default tanpa parameter. Oleh karena itu, pemanggilan new Mahasiswa02() tetap dapat dilakukan tanpa error karena konstruktor default tersebut yang sebenarnya dijalankan.