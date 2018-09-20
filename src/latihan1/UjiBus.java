package latihan1;

public class UjiBus {

    public static void main(String[] args) {
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("==================================");
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();
        // menambah penumpang 
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        // mengurangi penumpang
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        //menambahkan penumpang
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();

    }

}
