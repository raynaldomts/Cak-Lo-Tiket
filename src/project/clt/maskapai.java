import java.util.*;

public class maskapai{
    private String idMaskapai;
    private String namaMaskapai;
    private String tujuanPenerbangan;
    private Date waktuPenerbangan;
    private String idPenerbangan;

    public maskapai(String idMaskapai, String namaMaskapai, String tujuanPenerbangan, String idPenerbangan, Date waktuPenerbangan){
        this.idMaskapai = idMaskapai;
        this.namaMaskapai = namaMaskapai;
        this.tujuanPenerbangan = tujuanPenerbangan;
        this.waktuPenerbangan = waktuPenerbangan;
        this.idPenerbangan = idPenerbangan;
    }
}