public class DataDosen02 {

    Dosen02[] dataDosen;

    public DataDosen02(Dosen02[] arrayOfDosen) {
        this.dataDosen = arrayOfDosen;
    }

    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        int no = 1;
        for (Dosen02 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode : " + dosen.kode);
            System.out.println("Nama : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia : " + dosen.usia);
            System.out.println("----------------------------");
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata usia dosen pria : " + (double) totalPria / jumlahPria);
        System.out.println("Rata-rata usia dosen wanita : " + (double) totalWanita / jumlahWanita);
    }

    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 tertua = arrayOfDosen[0];

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen paling tua : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
    }

    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 termuda = arrayOfDosen[0];

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen paling muda : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }
}