import java.util.*;
import java.util.List;

public class jadwal{
    private String tujuan;
    private int  jumlahSeat;
    private Date tanggalBerangkat;
    private String idPenerbangan;
    private Date waktuBerangkat;

    public jadwal(String tujuan, String idPenerbangan, int jumlahSeat, Date tanggalBerangkat, Date waktuBerangkat ){
        this.tujuan = tujuan;
        this.jumlahSeat = jumlahSeat;
        this.tanggalBerangkat = tanggalBerangkat;
        this.idPenerbangan = idPenerbangan;
        this.waktuBerangkat = waktuBerangkat;
    }

public void setTujuan (String tujuan){
    this.tujuan = tujuan;
}

public String getTujuan (){
    return tujuan;
}

public void setidpenerbangan (String idPenerbangan){
    this.idPenerbangan = idPenerbangan;
}

public String getidpenerbangan (){
    return idPenerbangan;
}

public void setjlhSeat (int jumlahSeat){
    this.jumlahSeat = jumlahSeat;
}

public Integer getjlhSeat (){
    return jumlahSeat;
}
}