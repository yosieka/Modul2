
package tugas1;
import java.util.Scanner;
public class testTugas1 {

    public static void main(String[] args) {
        int ulangi;
        System.out.println("=================================");
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("=================================");
        praktikum1 data = new praktikum1();
        do{
              Scanner masukan = new Scanner(System.in);
              System.out.print("Masukkan Password : ");
              double password = masukan.nextDouble();
              if(password == 100){
              data.setPenumpang(20);
              data.setMaxPenumpang(150);
              data.setPenumpangBaru(100);             
              data.setBeratPenumpang(450);
              data.setPenumpang(10);
              data.cetak();
              System.out.println("Rata-Rata Adalah : " + data.getAverage2());
              }else{
                  System.out.println("Maaf, Password yang Anda Masukkan Salah");
              }
              System.out.print("Apakah anda ingin mengulangi? 1 for Ya dan 0 for Tidak : ");
              ulangi = masukan.nextInt();
        }while(ulangi==1);
        System.out.println("==============SELESAI==============");
        }
    
}
