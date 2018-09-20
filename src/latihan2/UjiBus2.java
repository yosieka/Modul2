
package latihan2;

public class UjiBus2 {

    public static void main(String[] args) {
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("==================================");
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        // menambah penumpang 
        busBesar.addpenumpang(15);
        busBesar.cetak();
        // menambah penumpang
        busBesar.addpenumpang(5);
        busBesar.cetak();
        //menambahkan penumpang
        busBesar.addpenumpang(26);
        busBesar.cetak();

    }
    
}
