import java.util.*;

public class pemesanan{
    private String idPemesanan;
    private Date tanggalPemesanan;
    private int  biaya;
    private static String idUser;
    private static int batasUser = 25;
    static Scanner userInput = new Scanner(System.in);
    static Random rand = new Random();

    pemesanan(String idPemesanan, Date tanggalPemesanan, int biaya ){
        this.idPemesanan = idPemesanan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.biaya = biaya;
    }

    public void setidPemesanan (String idPemesanan){
      this.idPemesanan = idPemesanan;
    }

    public String getidPemesanan (){
        return idPemesanan;
    }

    public void settglPemesanan ( Date tanggalPemesanan){
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public Date gettglPemesanan(){
        return this.tanggalPemesanan;   
    }

    public void setbiaya( int biaya){
        this.biaya = biaya;
    }

    public Integer getbiaya(){  
        return biaya;
    }

    static void pemesananTiket(){
        System.out.println("=======================================");
        System.out.println("Anda berada di fitur pemesanan tiket");
        System.out.println("Silahkan isi data diri anda terlebih dahulu.");

        System.out.print("Masukkan nama anda!\n");
        String nama = userInput.nextLine();
        System.out.print("Masukkan umur anda!\n");
        int umur = userInput.nextInt();
        
        System.out.println("Pastikan data diri berikut telah anda isi dengan benar");
        System.out.println("Nama: " + nama + "\t Umur: " + umur);
        System.out.println("Apakah data yang anda isi sudah benar? y/n");

        String option = userInput.next();
        switch (option) {
            case "y":
            System.out.println("Silahkan lengkapi data diri anda dibawah ini");
            System.out.print("Jenis kelamin: ");
            String jK = userInput.next();
            System.out.print("nomor telepon: ");
            String noTelp = userInput.next();
                break;
            case "n":
            System.out.println("Terima kasih telah menggunakan Cak Lo Tiket");
                return;
            default:
            System.err.println("Perintah yang anda masukkan tidak dikenali!");
                return;
            }
            
            int intRandom = rand.nextInt(batasUser);
            
        System.out.println("Tiket anda akan dibuat dengan id anda yaitu UC" + intRandom );
        System.out.println("Silahkan pilih tujuan penerbangan anda!");
        tiket.pesanTiket();

    }

}