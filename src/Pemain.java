/**
 * Class Pemain adalah class yang digunakan untuk pemain pada permainan
 * dimana class ini berisi nama dan nilai pemain
 * 
 * @author Kelsy Amirah
 * @version 19-11-2022
 */

public class Pemain{

    // inisialisasi atribut
    private String nama;
    private int nilai;

    /**
     * methode constructor dengan parameter
     * @param nama
     */
    public Pemain(String nama){
        this.nama = nama;
    }

    /**
     * methode mutator/setter
     * @param nama
     */
    public void setNama(String nama){
        this.nama = nama;
    }

    /**
     * methode accessor/getter
     * @return
     */
    public String getNama(){
        return this.nama;

    }

    /**
     *  methode accessor/ getter
     * @param nilaiBaru
     */
    public void setNilai(int nilaibaru){
        this.nilai = nilaibaru;
    }

    /**
     *  methode accessor/getter
     * @return
     */
    public int getNilai(){
        return this.nilai;
    }
    
}
