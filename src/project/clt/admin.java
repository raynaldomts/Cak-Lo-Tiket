import java.util.*;

public class admin {
    private String idAdmin;
    private String namaAdmin;
    private Boolean jenisKelamin;
    private Integer umur;
    private Date tanggalLahir;
    private String alamat;
    private Integer noTelp;
     
    public admin(String idAdmin, String namaAdmin, Boolean jenisKelamin, Integer umur, Date tanggalLahir, String alamat, Integer noTelp){
    this.idAdmin = idAdmin;
    this.namaAdmin = namaAdmin;
    this.jenisKelamin = jenisKelamin;
    this.umur = umur;
    this.tanggalLahir = tanggalLahir;
    this.alamat = alamat;
    this.noTelp = noTelp;
    }
    
    public void setidAdmin (String idAdmin){
        this.idAdmin = idAdmin;
    }  
      
    public String getidAdmin (){
        return idAdmin;
    }
     
    public void setName(String namaAdmin){
        this.namaAdmin = namaAdmin;
    }
    
    public String getName(){
        return namaAdmin;
    }
     
    public void setjenisKelamin( boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public Boolean getjenisKelamin (){
        return jenisKelamin;   
    }
    
    public void setUmur(Integer umur){
        this.umur = umur;
    }
    
    public Integer getUmur(){
        return umur;
    }
    
    public void settanggalLahir( Date tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public static void about(){
        System.out.println("Kelompok 10, mata kuliah Pemrograman Berorientasi Objek");
    }
}