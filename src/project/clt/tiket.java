import java.util.*;

public class tiket{
        String idTiket;
        String noSeat;
        String hargaTiket;
        static int pilihanTerbang;
        static Scanner chooser = new Scanner(System.in);

        public tiket (String idTiket, String noSeat, String hargaTiket){
                this.idTiket = idTiket;
                this.noSeat = noSeat;
                this.hargaTiket = hargaTiket;
        }

        public void sethargaTiket(String ht){
                hargaTiket = ht;
        }

        public String getidTiket(){
                return idTiket;
        }

        public String getnoSeat(){
                return noSeat;
        }

        public String getht(){
                return hargaTiket;
        }

        public static void refundTiket(){
                
        }
        
        public static void pesanTiket(){
                System.out.println("=============================");
                System.out.println("Tujuan Penerbangan");
                System.out.println("1. Jakarta\t2. Bandung\t3. Bali\t4. Yogyakarta");
                System.out.println("Silahkan masukkan tujuan penerbangan anda! (1-4)");
        pilihanTerbang = chooser.nextInt();
        switch (pilihanTerbang) {
            case 1:
                System.out.println("Harga tiket ke Jakarta adalah Rp 846.900");
                break;
            case 2:
                System.out.println("Harga tiket ke Bandung adalah Rp 2.138.700");
                break;
            case 3:
                System.out.println("Harga tiket ke Bali adalah Rp 1.436.500");
                break;
            case 4:
                System.out.println("Harga tiket ke Yogyakarta  adalah Rp 1.124.300");
                break;
            default:
                System.out.println("Harap masukkan perintah dengan benar");
                break;
        }
        
}
        


}
