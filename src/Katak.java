/**
 * Class Katak merupakan class yang digunakan sebagai object pada class utama
 * dimana class Katak berisikan posisi dan skor dari katak
 * 
 * @author Kelsy Amirah
 * @version 19-11-2022
 */

public class Katak{

    // instance variable
    private int posisi; // posisi katak
    private int skor;   // skor katak

    /**
     * methode constructor tanpa parameter
     */
    public Katak(){
        this.posisi = 0;
        this.skor = 100;
    }

    /**
     * methode accessor/getter
     * @return posisi
     */
    public int getPosisi(){
        return this.posisi;
    }

     /**
     * methode mutator (memasukkan posisi baru)
     * @param posisiBaru
     */
    public void setPosisi(int posisiBaru){
        this.posisi = posisiBaru;
    }

    /**
     * methode accessor/getter
     * @return skor
     */
    public int getSkor(){
        return this.skor;
    }

    /**
     * methode mutator (memasukkan skor baru)
     * @param skorbaru
     */
    public void setSkor(int skorBaru){
        this.skor = skorBaru;
    }

    /**
     * methode untuk katak maju 1 langkah
     * @return
     */
    public int loncatDekat(){
        System.out.println("\t\t\t\t\tKatak maju 1 kotak ke depan");
        return this.posisi += 1;
    }

    /**
     * methode untuk katak maju 2 langkah
     * @return
     */
    public int loncatJauh(){
        System.out.println("\t\t\t\t\tKatak maju 2 kotak ke depan");
        return this.posisi += 2;
    }

    /**
     * methode untuk katak mundur 1 langkah
     * @return
     */
    public int loncatMundurDekat(){
        System.out.println("\t\t\t\t\tKatak mundur 1 kotak ke belakang ");
        return this.posisi -= 1;
    }

    /**
     * methode untuk katak mundur 2 langkah
     * @return
     */
    public int loncatMundurJauh(){ 
        System.out.println("\t\t\t\t\tKatak mundur 2 kotak ke belakang ");
        return this.posisi -= 2;
    }

    /**
     * method untuk mengecheat 
     * agar permainan tidak terlalu lama
     * @return 
     */
    public int loncatCheat(){
        return this.posisi += 450;
    }

}
