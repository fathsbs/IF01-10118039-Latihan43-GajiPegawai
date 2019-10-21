/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menghitung gaji pegawai  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dalam 4 No 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);

        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTransport(), gaji.getUangTunjangan(), gaji.getGajiPokok(), (int) gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok()));
    }

}
