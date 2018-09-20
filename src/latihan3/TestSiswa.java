
package latihan3;

public class TestSiswa {

    public static void main(String[] args) {
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("==================================");
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        System.out.println("Name :" + siswa.getName() + "\nAbsen :" + siswa.getAbsen() + "\nAlamat :" + siswa.getAddress());
    }
    
}
