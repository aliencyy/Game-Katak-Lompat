/**
 * Class Monster2 merupakan class turunan dari class Monster (abstract class)
 * dimana pada class Monster2 akan me-override method abstract dari class Monster
 * 
 * @author Kelsy Amirah
 * @version 19-11-2022
 */

public class Monster2 extends Monster {

    // inisialisasi atribut
    private int nilai;
    private String nama;

    /**
     * methode constructor dengan parameter
     * @param nilai
     * @param nama
     */
    public Monster2(int nilai, String nama) {
        this.nilai = nilai;
        this.nama = nama;
    }

    @Override
    public int nilaiMonster() {
        return this.nilai;
    }

    @Override
    public String namaMonster() {
        return this.nama;
    }
    
}
