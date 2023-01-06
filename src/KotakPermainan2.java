 /**
 * Class KotakPermainan2 merupakan class yang berisikan jumlah kotak yang akan digunakan dalam permainan,
 * selain itu class ini juga digunakan untuk menyimpan jumlah koin dan monster 
 * serta digunakan untuk mengacak koin dan monster pada setiap kotak yang berbeda
 * 
 * @author Kelsy Amirah
 * @version 19-11-2022
 */

// package yang digunakan untuk membuat array list dan collections
import java.util.ArrayList;
import java.util.Collections;

public class KotakPermainan2 {

    // inisialisasi atribut
    private int jumlahKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private int acakKoin[];
    private int acakMonster[];
    private Kotak[] boardGame;

    /**
     * methode constructor dengan parameter
     * @param j
     * @param jk
     * @param jm
     */
    public KotakPermainan2(int j, int jk, int jm){
        this.jumlahKotak = j;
        this.jumlahKoin = jk;
        this.jumlahMonster = jm;

        generateAcak();
        inisialisasiKotak();
    }

    /**
     * method mengacak list yang digunakan untuk mengisi koin dan monster
     * yang sesuai dengan jumlah kotak, koin dan monster
     */
    private void generateAcak(){
        // untuk menghasilkan nilai acak yang tidak berulang
        // membuat object array list dengan tipe data integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        acakKoin = new int[jumlahKoin];
        acakMonster = new int[jumlahMonster];

        // nilai acak sesuai jumlahKotak
        for (int i = 0; i < this.jumlahKotak; i++){
            list.add(i); // memasukkan values ke dalam list
        }
        Collections.shuffle(list);

        // untuk menghasilkan nilai acak untuk koin
        for (int i = 0; i < this.jumlahKoin; i++){
            acakKoin[i] = list.get(i);
        }

        // untuk menghasilkan posisi monster pada kotak
        // posisi monster tidak boleh sama dengan posisi koin
        for (int i = jumlahKoin; i < jumlahMonster + jumlahKoin; i++){
            acakMonster[i - jumlahKoin] = list.get(i);
        }
    }

    /**
     * methode inisialasi kotak 
     * digunakan untuk mengisi kotak yang sudah ada dengan object koin dan monster
     */
    private void inisialisasiKotak(){
        boardGame = new Kotak[jumlahKotak];
        Koin2 k2 = new Koin2(7);
        Monster2 m2 = new Monster2(-10, "Hanzo");
        
        for(int i = 0; i < jumlahKotak; i++){
            boardGame[i] = new Kotak();
        }

        for(int i = 0; i < jumlahKoin; i++){
            boardGame[acakKoin[i]].addKoin(k2);
        }

        for(int i = 0; i < jumlahMonster; i++){
            boardGame[acakMonster[i]].addMonster(m2);
        }
    }

    /**
     * @param posisi
     * @return
     */
    public int contain(int posisi){
        if(boardGame[posisi].isThereKoin()){
            return boardGame[posisi].getKoin().nilaiKoin();
        }else if(boardGame[posisi].isThereMonster()){
            return boardGame[posisi].getMonster().nilaiMonster();
        }else{
            return 0;
        }
    }
}
