
package tugas2;
import java.util.Scanner;
public class ujiBola {

    public static void main(String[] args) {
int ulangi;
Scanner masukan = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("================================="); 
        bola data = new bola();
        System.out.print("Masukkan jari-jari : ");
        double jari = masukan.nextDouble();
        data.setjari(jari);
        System.out.println("Diameter : " + data.showDia());
        System.out.println("Luas Permukaan :" + data.showLuasP());
        System.out.println("Volume : " + data.showVolum());
 
    }
    
}
