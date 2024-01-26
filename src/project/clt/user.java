import java.text.SimpleDateFormat;
import java.util.*;

public class user{
    private String idUser;
    private String namaUser;
    private int umur;
    private boolean jenisKelamin;
    private String tanggalLahir;
    private String jadwalPenerbangan;
    private String idTiket;
    private String alamat;
    private String noTelp;
    private String tujuanPenerbangan;

    Scanner terminalInput = new Scanner(System.in);

    public user(String idUser, String namaUser, int umur, boolean jenisKelamin, String tanggalLahir, String jadwalPenerbangan, String idTiket, String alamat, String noTelp, String tujuanPenerbangan){
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.jadwalPenerbangan = jadwalPenerbangan;
        this.idTiket = idTiket;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.tujuanPenerbangan = tujuanPenerbangan;
}

public void setIdUser (String idUser){
    this.idUser = idUser;
}

public String getIdUser (){
    return idUser;
}

public void  setName(String namaUser){
this.namaUser = namaUser;
}

public String getName(){ 
    return namaUser;
}

public void setUmur( int umur){
this.umur = umur;
}

public Integer getUmur(){  
    return umur;
}

public void setJenisKelamin( boolean jenisKelamin){
this.jenisKelamin = jenisKelamin;
}

public Boolean getJenisKelamin (){
    return jenisKelamin;   
}

public void setTanggalLahir( String tanggalLahir){
this.tanggalLahir = tanggalLahir;
    
}
public String getTanggalLahir(){
return this.tanggalLahir;   
}

public void setJadwalPenerbangan( String jadwalPenerbangan){
this.jadwalPenerbangan = jadwalPenerbangan;
        
}
public String getJadwalPenerbangan(){
return this.jadwalPenerbangan;   
}

public void setIdTicket( String idTiket){
this.idTiket = idTiket;

}
public String getIdTicket(){
return this.idTiket;   
}

public void setAlamat( String alamat){
this.alamat = alamat;
        
}
public String getAlamat(){
return this.alamat;   
}

public void setNoTelp( String noTelp){
this.noTelp = noTelp;
        
}
public String getNoTelp(){
return this.noTelp;   
}

public void setTujuanPenerbangan( String tujuanPenerbangan){
this.tujuanPenerbangan = tujuanPenerbangan;
        
}
public String getTujuanPenerbangan(){
return this.tujuanPenerbangan;   
}

}
