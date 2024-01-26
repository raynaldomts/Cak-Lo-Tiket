import java.util.*;

public class kursi{
    private String idUser;
    private String idPesawat;
    private String idMaskapai;
    private String noSeat;

    public kursi(String idUser, String idPesawat, String idMaskapai, String noSeat){
        this.idUser = idUser;
        this.idPesawat = idPesawat;
        this.idMaskapai = idMaskapai;
        this.noSeat = noSeat;
    }

    public void setidUser (String idUser){
        this.idUser = idUser;
    }

    public String getidUser (){
        return idUser;
    }

    public void  setidPesawat (String idPesawat){
    this.idPesawat = idPesawat;
    }

    public String getidPesawat(){ 
        return idPesawat;
    }

    public void setidMaskapai( String idMaskapai){
        this.idMaskapai = idMaskapai;
    }
    public String getidMaskapai(){
        return this.idMaskapai;   
    }

    public void setnoSeat( String noSeat){
        this.noSeat = noSeat;
    }

    public String getnoSeat(){
        return this.noSeat;   
    }
}