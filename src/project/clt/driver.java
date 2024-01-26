import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class driver {
    public static void main(String[] args) {

        Scanner chooser = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Selamat datang di aplikasi\n \t Cak Lo Tiket");
        System.out.println("=======================================");
        System.out.println("Silahkan pilih menu yang tersedia:");
        System.out.println("1. Pemesanan Tiket");
        System.out.println("2. Refund Tiket");
        System.out.println("3. Tentang Kami\n");
        System.out.print("Ketik 1-3 untuk memilih menu\nPilhan anda adalah: ");
        
        String stringChooser = chooser.nextLine();
        int intChooser;

        switch (stringChooser){
            case "1":
                // Mengakses menu pemesanan tiket
                pemesanan.pemesananTiket();
                break;
            case "2":
                // Mengakses menu refund tiket
                tiket.refundTiket();
                break;
            case "3":
                // Mengakses menu about
                admin.about();
                break;
                default:
            System.err.println("Menu yang anda pilih tidak tersedia");
        }   
    }
}
