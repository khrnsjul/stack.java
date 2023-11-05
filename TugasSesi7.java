import java.util.Scanner;
import java.util.Stack;

public class TugasSesi7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Stack<TugasSesi7> stackBuku = new Stack<>();
            int jumlahBuku;
            //Input Data
            System.out.print("Masukkan jumlah buku: ");
            jumlahBuku = input.nextInt();
            input.nextLine();

            for (int i = 0; i < jumlahBuku; i++) {
                TugasSesi7 buku = new TugasSesi7();

                System.out.println("Buku ke-" + (i + 1));
                System.out.print("Judul: ");
                buku.setJudul(input.nextLine());
                System.out.print("Author: ");
                buku.setAuthor(input.nextLine());
                System.out.print("Penerbit: ");
                buku.setPenerbit(input.nextLine());
                System.out.print("Kategori (1-Teknik, 2-Manajemen, 3-Fiksi, 4-Lainnya): ");
                buku.setKategori(input.nextInt());
                System.out.print("Tahun: ");
                buku.setTahun(input.nextInt());
                input.nextLine();

                //Kode stackBuku.push(buku) digunakan untuk memasukkan objek buku ke dalam stack stackBuku.
                stackBuku.push(buku);
            }

            //Membuat Tabel
            System.out.println("=====================================================================================================");
            System.out.println("Daftar Buku Java yang Tersedia");
            System.out.println("=====================================================================================================");
            System.out.println("No  Judul                       Pengarang               Penerbit           Ketegori  Tahun");
            System.out.println("=====================================================================================================");

            //Kode tersebut digunakan untuk melakukan loop pada stack stackBuku, dan setiap elemen pada stack di-pop 
            //atau dihapus satu per satu dengan menggunakan method pop() dan dimasukkan ke dalam variabel 
            //buku yang bertipe data TugasSesi7.
            int no = 1;
            int bukuTeknik = 0;
            int bukuManajemen = 0;
            int bukuFiksi = 0;
            int bukuLainnya = 0;
            int bukuLawas = 0;
            int bukuBaru = 0;
            while (!stackBuku.isEmpty()) {
                TugasSesi7 buku = stackBuku.pop();

                if (buku.getTahun() < 2010) {
                    bukuLawas++;
                } else {
                    bukuBaru++;
                }

                switch (buku.getKategori()) {
                    case 1:
                        bukuTeknik++;
                        break;
                    case 2:
                        bukuManajemen++;
                        break;
                    case 3:
                        bukuFiksi++;
                        break;
                    case 4:
                        bukuLainnya++;
                        break;
                    default:
                        break;
                }

                System.out.printf("%-4d%-36s%-24s%-20s%-10d%-6d%n", no++, buku.getJudul(), buku.getAuthor(), buku.getPenerbit(), buku.getKategori(), buku.getTahun());

            }

            //Memanggil Data Penjumlahan
            System.out.println("=====================================================================================================");
            System.out.println("Jumlah Buku Java yang Tersedia");
            System.out.println("=====================================================================================================");
            System.out.println("Buku Teknik: " + bukuTeknik);
            System.out.println("Buku Manajemen: " + bukuManajemen);
            System.out.println("Buku Fiksi: " + bukuFiksi);
            System.out.println("Buku Lainnya: " + bukuLainnya);
            System.out.println("Buku Lawas (Tahun < 2010): " + bukuLawas);
            System.out.println("Buku Baru (Tahun >= 2010): " + bukuBaru);
        }
    }
    
    private String judul;
    private String author;
    private String penerbit;
    private int kategori;
    private int tahun;
    
    
    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public int getKategori() {
        return kategori;
    }
    
    public void setKategori(int kategori) {
        this.kategori = kategori;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
}
        
