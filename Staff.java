public class Staff extends Pegawai {
    private double gajiPerjam;
    private int jamKerja;

    public Staff(String id, String nama, double gajiPerjam, int jamKerja) {
        super(id, nama);
        this.gajiPerjam = gajiPerjam;
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji () {
        return gajiPerjam * jamKerja;
    }
}