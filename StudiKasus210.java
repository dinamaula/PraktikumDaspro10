import java.util.Scanner;

public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;
        int kurangDokumen;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();
        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
        statusPKM = sc.nextInt();

        if (jumlahDokumen < 4) {
            kurangDokumen = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang) " + kurangDokumen + "dokumen). Dana penghargaan tidak diberikan.");
        } else {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan");
                } else {
                    System.out.println("Status: Dokumen lengkap, tetapi bukan juara 1, 2, atau 3." + "Dana penghargaan tidak diberikan.");
                }
            }
        }
    }
}
