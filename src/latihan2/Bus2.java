package latihan2;

public class Bus2 {

    public int penumpang;
    public int maxPenumpang;

    public Bus2(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    
    // method mutator untuk menambahkan penumpang
    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }

    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang adalah :" + penumpang);
        System.out.println("Penumpang maximum seharusnya adalah :" + maxPenumpang);
    }

}
