public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String asal;  // Atribut baru asal

    public Mahasiswa(String nim, String nama, String jenisKelamin, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asal = asal;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setAsal(String asal) { this.asal = asal; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getAsal() { return this.asal; }
}
