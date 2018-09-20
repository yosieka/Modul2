package tugas1;

public class praktikum1 {

    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double Average;
    public double beratPenumpang , berat;

    public double getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public double getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setMaxPenumpang(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public double getPenumpangBaru() {
        return penumpangBaru;
    }

    public void setPenumpangBaru(double penumpangBaru) {
        this.penumpangBaru = penumpangBaru;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }

    public double getBeratPenumpang() {
        return beratPenumpang;
    }

    public void setBeratPenumpang(double beratPenumpang) {
        this.beratPenumpang = beratPenumpang;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    
    public void bus(double penumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addpenumpang(double penumpang, double beratPenumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            this.beratPenumpang = beratPenumpang;
        }

    }

    public void getpenumpang(int password) {
        if (password == 100) {
            System.out.println("Password yang Anda Masukkan Benar");
        } else {
            System.out.println("Maaf, Password yang Anda Masukkan Salah");
        }
    }

    
    public double getAverage2() {
        Average = this.beratPenumpang / this.penumpang;
       return Average;
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang :" + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah :" + maxPenumpang);
    }
    
}
