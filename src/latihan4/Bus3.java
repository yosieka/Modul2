
package latihan4;

public class Bus3 {
    public int penumpang;
    public int maxPenumpang;
    
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    // method mutator
    public void addpenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if(temp > maxPenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else {
        this.penumpang = temp;
    }
    
    }public void getpenumpang(int password){
        if(password == 24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
}
    public void cetakpenumpang(){
        System.out.println("Penumpang bus sekarang :" + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah :" + maxPenumpang);
    }
        
    }

