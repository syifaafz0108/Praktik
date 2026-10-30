import java.util.ArrayList;

public class MainPenggajian {
    public static void main(String[] args) {
        // 1. Membuat objek berbeda tipe
        Manajer m1 = new Manajer("M001", "Budi Santoso", 15000000, 5000000);
        Staff s1 = new Staff("S001", "Siti Aminah", 50000, 160);
        Staff s2 = new Staff("S002", "Andi Wijaya", 50000, 172);
        
        // Menambahkan objek Freelancer baru sesuai tugas
        Freelancer f1 = new Freelancer("F001", "Rina Melati", 4, 1250000);

        // 2. UPCASTING & POLIMORFISME
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(m1); 
        daftarPegawai.add(s1); 
        daftarPegawai.add(s2);
        daftarPegawai.add(f1); // Masukkan Freelancer ke dalam list Pegawai

        // 3. VIRTUAL METHOD INVOCATION (VMI)
        System.out.println("==== SLIP GAJI BULAN INI ====");
        for (Pegawai p : daftarPegawai) {
            System.out.println("Tipe Objek: " + p.getTipePegawai());
            p.cetakSlipGaji();
        }

        // 4. INSTANCEOF: Mengecek tipe objek saat runtime
        System.out.println("----- CEK TIPE OBJEK -----");
        for (Pegawai p : daftarPegawai) {
            if (p instanceof Manajer) {
                System.out.println(p.nama + " adalah MANAJER (dapat tunjangan)");
            } 
            else if (p instanceof Staff) {
                System.out.println(p.nama + " adalah STAFF (gaji per jam)");
            }
            else if (p instanceof Freelancer) {
                System.out.println(p.nama + " adalah FREELANCER (gaji per proyek)");
            }
        }

        // 5. Menghitung total pengeluaran perusahaan
        double totalPengeluaran = 0;
        for (Pegawai p : daftarPegawai) {
            totalPengeluaran += p.hitungGaji();
        }
        System.out.println("\nTotal Pengeluaran Perusahaan: Rp " + totalPengeluaran);
    }
}