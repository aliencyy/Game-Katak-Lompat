/**
 * Class Koin3 merupakan class turunan dari class Koin (abstract class)
 * dimana pada class Koin3 akan me-override method abstract dari class Koin1
 * 
 * @author Kelsy Amirah
 * @version 19-11-2022
 */

public class Koin3 extends Koin {

    // inisialisasi atribut
    private int nilai;

    /**
     * methode constructor dengan parameter
     * @param nilai
     */
    public Koin3(int nilai) {
        this.nilai = nilai;
    }
    
    @Override
    public int nilaiKoin() {
        return this.nilai;
    }
    
}
