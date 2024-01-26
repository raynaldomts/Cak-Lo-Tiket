import java.util.*;

public class pembayaran{
    private String idPembayaran;
    private Date tglPembayaran;

    public pembayaran(String idPembayaran, Date tglPembayaran){
        this.idPembayaran = idPembayaran;
        this.tglPembayaran = tglPembayaran;
    }

    public void setIdPembayaran (String idPembayaran){
        this.idPembayaran = idPembayaran;
    }
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setTglPembayaran ( Date tglPembayaran){
        this.tglPembayaran = tglPembayaran;
    }

    public Date tglPembayaran(){

        return tglPembayaran;
    }

    }