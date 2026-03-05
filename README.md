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
4. Apa yang dilakukan oleh kode program berikut? 
    arrayOfMahasiswa[0] = new Mahasiswa02();
    arrayOfMahasiswa[0].nim = "244107060033";
    arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
    arrayOfMahasiswa[0].kelas = "SIB-1E";
    arrayOfMahasiswa[0].ipk = (float) 3.75;
Jawaban: Kode tersebut berfungsi untuk:
a. Membuat objek Mahasiswa02 pada indeks pertama array.
b. Mengisi semua atribut mahasiswa tersebut (nim, nama, kelas, ipk).
Secara sederhana, kode ini sedang membuat satu data mahasiswa lengkap lalu menyimpannya di dalam array of object pada posisi pertama.
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
Jawaban:Class Mahasiswa02 dan MahasiswaDemo02 dipisahkan karena memiliki tugas yang berbeda. Mahasiswa02 berfungsi sebagai representasi data mahasiswa, sedangkan MahasiswaDemo02 berfungsi untuk menjalankan program. Pemisahan ini membuat kode lebih rapi, terstruktur, sesuai prinsip OOP, dan lebih mudah dikembangkan.

3.3 Pertanyaan & Jawaban 
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program 
pada langkah no 3.
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama 
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
        Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3];
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;
Jawaban: Kode tersebut menyebabkan error karena objek Mahasiswa di dalam array belum dibuat (belum diinstansiasi).yang dibuat hanya array atau tempat penyimpanan untuk 3 objek Mahasiswa, tetapi setiap elemen array masih bernilai null.Ketika program langsung mengakses atribut seperti nim, nama, kelas, dan ipk, program mencoba menggunakan objek yang belum ada, sehingga terjadi NullPointerException.Agar tidak error, setiap elemen array harus dibuat objeknya terlebih dahulu menggunakan new Mahasiswa() sebelum mengisi atributnya.


3.4 Pertanyaan & Jawaban 
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
Jawaban: Iya, suatu class dapat memiliki lebih dari satu constructor. Hal ini disebut constructor overloading. Constructor overloading terjadi ketika dalam satu class terdapat beberapa constructor yang memiliki nama sama tetapi parameter yang berbeda, baik dari jumlah maupun tipe datanya.Dengan adanya beberapa constructor, objek dapat dibuat dengan cara yang berbeda sesuai kebutuhan.contohnya:

public class Matakuliah02 {
    String kode;
    String nama;
    int sks;
    int jam;

    // constructor tanpa parameter
    public Matakuliah02() {
    }

    // constructor dengan parameter
    public Matakuliah02(String kode, String nama, int sks, int jam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jam = jam;
    }
}