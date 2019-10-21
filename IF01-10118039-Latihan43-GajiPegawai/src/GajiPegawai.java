/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menghitung gaji pegawai    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class GajiPegawai {

    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        double totalgaji = uangTunjangan + uangTransport + gajiPokok;
        return totalgaji;
    }

    public void tampilData(String nama,String alamat,int uangTransport,int uangTunjangan,int gajiPokok,int totalgaji){
        System.out.printf("Nama karyawan \t: %s%n",nama);
        System.out.printf("Alamat \t\t: %s%n", alamat);
        System.out.printf("Uang Transpotr \t: Rp. %d%n", uangTransport);
        System.out.printf("Uang Tunjangan \t: Rp. %d%n", uangTunjangan);
        System.out.printf("Gaji Pokok \t: Rp. %d%n", gajiPokok);
        System.out.printf("TOTAL GAJI \t: Rp. %d %n", totalgaji);
    }
}
