import java.util.Scanner;
public class DosenDemo02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan jumlah Dosen : ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen02[] arrayOfDosen02 = new Dosen02[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                                    : ");
            kode = sc.nextLine();
            System.out.print("Nama                                    : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria/false=Wanita)  : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia                                    : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------");
            
            arrayOfDosen02[i] = new Dosen02(kode, nama, jenisKelamin, usia);
        }

        DataDosen02 dataDosen = new DataDosen02(arrayOfDosen02);
        
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        dataDosen.dataSemuaDosen(arrayOfDosen02);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen02);

        System.out.println("\n===== RATA - RATA USIA PER JENIS KELAMIN =====");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen02);

        System.out.println("\n===== DOSEN PALING TUA =====");
        dataDosen.infoDosenPalingTua(arrayOfDosen02);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        dataDosen.infoDosenPalingMuda(arrayOfDosen02);

        sc.close();
    }
}