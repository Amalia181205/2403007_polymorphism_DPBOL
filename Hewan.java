public class Hewan{
    public int usia;
    private String nama;

    public Hewan(int usia, String nama) {
        this.usia = usia;
        this.nama = nama;
    }

    
    public Hewan(int usia) {
        this.usia = usia;
    }

    
    public Hewan(String nama) {
        this.nama = nama;
    }


    public void berkomunikasi(){
        System.out.println("Hewan berusia" +this.usia +"tahun, dengan nama " +this.nama +", berkomunikasi");
    }
}