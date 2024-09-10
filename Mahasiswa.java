public class Mahasiswa {
    String nama;
    String nim;
    String hobi;

    Mahasiswa(String nama, String nim, String hobi) {
        this.nama = nama;
        this.nim = nim;
        this.hobi = hobi;
    }

    void InfoMahasiswa() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Hobi : " + this.hobi);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Zahra Anisa", "12350121727", "Menggambar/ Sketsa");

        mahasiswa.InfoMahasiswa();
    }
}