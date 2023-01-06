/**
 * Class Kotak merupakan class yang berisikan koin (dari class Koin)
 * dan berisikan monster (dari class Monster)
 * 
 * @author Kelsy Amirah
 * @version 19-11-2022
 */

public class Kotak{
    
    // object member (Kotak)
    private Koin coin;
    private Monster monsta;

    /**
     * methode constructor tanpa parameter/first constructor
     */
    public Kotak(){

    }

    /**
     * @param c
     */
    public void addKoin(Koin c){
        this.coin = c;
    }

    /**
     * @param m
     */
    public void addMonster(Monster m){
        this.monsta = m;
    }

    /**
     * methode acessor/getter
     * @return coin
     */
    public Koin getKoin(){
        return this.coin;
    }

    /**
     * methode acessor/getter
     * @returnmonster
     */
    public Monster getMonster(){
        return this.monsta;
    }

    /**
     * Metode pengakses dengan nilai pengembalian boolean
     * @return boolean
     */
    public boolean isThereKoin(){
        return coin != null;
    }

    /**
     * Metode pengakses dengan nilai pengembalian boolean
     * @returnboolean
     */
    public boolean isThereMonster(){
        return monsta != null;
    }

}
