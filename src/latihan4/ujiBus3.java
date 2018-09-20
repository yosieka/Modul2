package latihan4;

public class ujiBus3 {

    public static void main(String[] args) {
        Bus3 Bus = new Bus3(5);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
    }
}
