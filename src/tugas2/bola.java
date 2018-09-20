
package tugas2;

public class bola {
    private double jari;

    public void setJari(double jari) {
        this.jari = jari;
    }
    private double dia;
    private double luasP;
    private double volum;

    public double showJari() {
        return jari;
    }

    public double showDia() {
        dia = jari + jari;
        return dia;
    }

    public double showLuasP() {
        luasP = 4 * Math.PI * jari * jari;
        return luasP;
    }

    public double showVolum() {
        volum = 4/3 * Math.PI * jari*jari*jari;
        return volum;
    }
     public void setjari(double jari){
         this.jari = jari;
     }
     
}
