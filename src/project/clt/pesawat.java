import java.util.*;

public class pesawat{
    private String idPesawat;
    private String keberangkatan;
    private String tujuan;

    public pesawat(String idPesawat, String keberangkatan, String tujuan){
        this.idPesawat = idPesawat;
        this.keberangkatan = keberangkatan;
        this.tujuan = tujuan;
    }

    public String getDeparture(String departure){
        this.keberangkatan = departure;
        return this.keberangkatan;
    }

    public String getArrived(String arrived){
        this.tujuan = arrived;
        return this.tujuan;
    }
}