/**
 * Class MainLompatKatak merupakan class utama untuk run program
 * 
 * @author Kelsy Amirah
 * @version 30-10-2022
 * Link video : https://drive.google.com/file/d/1Zb_L8kSSU-NfuhIE9ZxLtL7pRfFp43xM/view?usp=sharing
 */

import java.util.Scanner;

public class MainLompatKatak {

    /**
     * methode constructor dengan parameter
     * methode MainLompatKatak berisi inputan nama pemain,
     * serta untuk mengubah nama pemain apabila diinginkan
     * method MainLompatKatak juga berisi mekanisme permainan 'Lompat hai katak,lompat!'
     * yaitu membuat papan permainan, memilih lompatan katak
     * serta menampilkan hasil akhir(komentar) pemain
     * @param namaAwal
     */
    public static void MainLompatKatak(String namaAwal) {

        // membuat object
        KotakPermainan1 game1;
        KotakPermainan2 game2;
        KotakPermainan3 game3;

        Katak katak = new Katak();

        // membuat scanner 
        Scanner input = new Scanner(System.in);
        Scanner level = new Scanner(System.in);
        Scanner ubahNama = new Scanner(System.in);

        String nama = namaAwal;
        
        Pemain p1 = new Pemain(nama);
        System.out.print("Apakah anda ingin merubah nama? (Y/N) : ");

        do{
            String ayo;
            ayo = ubahNama.next();

            if("N".equalsIgnoreCase(ayo)){
                break;
            }if("Y".equalsIgnoreCase(ayo)){
                System.out.print("Silakan inputkan nama baru : ");
                nama = ubahNama.next();
                p1.setNama(nama);
                break;
            }else{
                System.err.print("Silakan masukkan inputan berupa (Y/N) : ");
                continue;
            }
        } while (true);

        System.out.println("\n\t\t\t+-----------------------------------------------------+");
        System.out.println("\t\t\t\tSelamat bermain "+p1.getNama()+", Semoga berhasil ! ^^");
        System.out.println("\t\t\t+-----------------------------------------------------+\n");

        /**
         * Memilih Level
         */
        System.out.println("\t\t\t\t\t+-----------------------+ ");
        System.out.println("\t\t\t\t\t|     Pilihan Level     |");
        System.out.println("\t\t\t\t\t+-----------------------+ ");
        System.out.println("\t\t\t\t\t|   1. Easy             |");
        System.out.println("\t\t\t\t\t|   2. Intermediet      |");
        System.out.println("\t\t\t\t\t|   3. Hard             |");
        System.out.println("\t\t\t\t\t+-----------------------+ ");
        System.out.print("\nSilakan pilih level yang anda inginkan : ");
        int pilihLevel = level.nextInt();

        /**
         * membuat papan permainan game dengan jumlah kotak,koin dan monster tertentu
         * dilanjutkan menampilkan isi 20 kotak permainan
         */
        game1 = new KotakPermainan1(500, 200, 100);
        game2 = new KotakPermainan2(500, 200, 100);
        game3 = new KotakPermainan3(500, 200, 100);
        
        if(pilihLevel == 1) {
            game1 = new KotakPermainan1(500, 200, 100);
            //System.out.println("\nKotak permainan");

            for (int i = 0; i < 20; i++) { //setiap kotak akan berulang dengan nilai-nilai yang sudah diacak
                //System.out.print(game1.contain(i));
                //System.out.print(" ");
            }
            
            System.out.println("\n");
        }else if(pilihLevel == 2) {
            game2 = new KotakPermainan2(500, 200, 100);
            //System.out.println("\nKotak permainan");

            for (int i = 0; i < 20; i++) { //setiap kotak akan berulang dengan nilai-nilai yang sudah diacak
                //System.out.print(game2.contain(i));
                //System.out.print(" ");
            }
            
            System.out.println("\n");
        }else if(pilihLevel == 3) {
            game3 = new KotakPermainan3(500, 200, 100);
            //System.out.println("\nKotak permainan");

            for (int i = 0; i < 20; i++) { //setiap kotak akan berulang dengan nilai-nilai yang sudah diacak
                //System.out.print(game3.contain(i));
                //System.out.print(" ");
            }
            
            //System.out.println("\n");
        }else {
            System.out.println("Anda salah menginput pilihan level");
            System.out.println("Silakan input level berupa 1/2/3");
        }

        /**
         * katak bisa melompat maju ke depan 1 atau 2 kotak
         * katak bisa melompat mundur ke belakang 1 atau 2 kotak
         * dengan menampilkan posisi dan skor
         */
        int pilihan;

        while(katak.getSkor() > 0 && katak.getPosisi() != 499){
            
            System.out.println("\n\t\t\t\t     Katak berada pada kotak ke : " + katak.getPosisi());
            System.out.println("\n\t\t\t\t      Score katak saat ini: " + katak.getSkor());

            // jika katak berada pada katak.getPosisi() 498 maka
            // lompatan maju 1 kotak untuk mengakhiri permainan
            if (katak.getSkor() <= 0){
                break;
            }
            if (katak.getPosisi() == 498) {
                System.out.println("\t\t\t\t\t1 lompatan maju terakhir ");
            }

            System.out.println("\n");
            System.out.println("\t\t\t\t\t+---------------------+ ");
            System.out.println("\t\t\t\t\t|   Lompatan Katak    |");
            System.out.println("\t\t\t\t\t+---------------------+ ");
            System.out.println("\t\t\t\t\t| 1. Maju 1 langkah   |");
            System.out.println("\t\t\t\t\t| 2. Maju 2 langkah   |");
            System.out.println("\t\t\t\t\t| 3. Mundur 1 langkah |");
            System.out.println("\t\t\t\t\t| 4. Mundur 2 langkah |");
            System.out.println("\t\t\t\t\t+---------------------+ ");
            System.out.print("\t\t\t\t\tKatak akan lompat : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                katak.loncatDekat(); // katak maju 1 kotak
            } else if (pilihan == 2) {
                katak.loncatJauh(); // katak maju 2 kotak
            } else if (pilihan == 3) {
                katak.loncatMundurDekat(); // katak mundur 1 kotak
            } else if (pilihan == 4) {
                katak.loncatMundurJauh(); // katak mundur 2 kotak
            } else if (pilihan == 22) {
                katak.loncatCheat(); // mengecheat posisi katak agar permainan cepat selesai
            } else {
                continue;
            }

            if (pilihLevel == 1) {
                // merubah skor setiap melalui kotak dengan menambah skor sebelumnya dengan isi dari kotak
                katak.setSkor(katak.getSkor() + game1.contain(katak.getPosisi()));
                if (game1.contain(katak.getPosisi()) == 10) {
                    System.out.println("\n\t\t\t\t\tKatak mendapat koin \n\t\t\t\t\tSkor katak bertambah 10");
                } else if (game1.contain(katak.getPosisi()) == -5) {
                    System.out.println("\n\t\t\t\t    Oh tidak! Katak bertemu monster:(\n\t\t\t\t\tSkor katak berkurang 5");
                } else {
                    System.out.print("\n\t\t\t\t\t    Kotak Kosong");
                }
            }else if (pilihLevel == 2) {
                // merubah skor setiap melalui kotak dengan menambah skor sebelumnya dengan isi dari kotak
                katak.setSkor(katak.getSkor() + game2.contain(katak.getPosisi()));
                if (game2.contain(katak.getPosisi()) == 10) {
                    System.out.println("\n\t\t\t\t\tKatak mendapat koin \n\t\t\t\t\tSkor katak bertambah 10");
                } else if (game2.contain(katak.getPosisi()) == -5) {
                    System.out.println("\n\t\t\t\t    Oh tidak! Katak bertemu monster:(\n\t\t\t\t\tSkor katak berkurang 5");
                } else {
                    System.out.print("\n\t\t\t\t\t    Kotak Kosong");
                }
            }else if (pilihLevel == 3) {
                // merubah skor setiap melalui kotak dengan menambah skor sebelumnya dengan isi dari kotak
                katak.setSkor(katak.getSkor() + game3.contain(katak.getPosisi()));
                if (game3.contain(katak.getPosisi()) == 10) {
                    System.out.println("\n\t\t\t\t\tKatak mendapat koin \n\t\t\t\t\tSkor katak bertambah 10");
                } else if (game3.contain(katak.getPosisi()) == -5) {
                    System.out.println("\n\t\t\t\t    Oh tidak! Katak bertemu monster:(\n\t\t\t\t\tSkor katak berkurang 5");
                } else {
                    System.out.print("\n\t\t\t\t\t    Kotak Kosong");
                }
            }
            
        }

        // tampilan skor dan nama setelah selesai bermain
        System.out.println("\n\n\t\t\t\t\tPermainan Selesai");
        p1.setNilai(katak.getSkor());
        System.out.println("\t\t\t\t\tNama Pemain : " + p1.getNama());

        /*
         * penilaian score akhir dari pemain
         * jika score lebih dari 1500 maka excelent
         * jika score diantara 500 dan 1500 maka good
         * jika score kurang dari 500 maka good luck
         */
        if (p1.getNilai() > 1500) {
            System.out.println("\n\t\t\t\t\tExcellent!!! ");
            System.out.println("\t\t\t\t\tSkor akhir  : " + p1.getNilai());
        } else if (p1.getNilai() > 500 && p1.getNilai() < 1500) {
            System.out.println("\n\t\t\t\t\tGood!!! ");
            System.out.println("\t\t\t\t\tSkor akhir  : " + p1.getNilai());
        } else {
            System.out.println("\n\t\t\t\t\tT_T you are a bad player");
            System.out.println("\n\t\t\t\t\tSkor akhir  : " + p1.getNilai());
        }
        System.out.println("\n\t\t\t              Terimakasih telah bermain\n");

    }

    /** 
     * methode rulesGame berisi aturan-aturan dalam permainan
     */
    public static void rulesGame(){
        System.out.println("\n");
        System.out.println("+---------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\t\t\t\tPeraturan Permainan Lompat hai katak, lompat!\t\t\t\t\t|");
        System.out.println("+---------------------------------------------------------------------------------------------------------------+");
        System.out.println("| 1. Posisi awal katak pada kotak adalah 0\t\t\t\t\t\t\t\t\t|");
        System.out.println("| 2. Pemain dapat memilih level yang diinginkan\t\t\t\t\t\t\t\t\t|");
        System.out.println("| 3. Setiap level memiliki nilai koin dan monster yang berbeda-beda\t\t\t\t\t\t|");
        System.out.println("| 4. Katak dapat melompat 1 kotak kedepan, 2 kotak ke depan, 1 kotak ke belakang, dan 2 kotak ke belakang\t|");
        System.out.println("| 5. Tujuan akhir lompatan adalah mencapai kotak dengan angka 500\t\t\t\t\t\t|");
        System.out.println("| 6. Jika berhasil sampai ke kotak angka 500 maka pemain menang\t\t\t\t\t\t\t|");
        System.out.println("| 7. Jika skor katak lebih kecil dari 0, maka pemain dianggap kalah    \t\t\t\t\t\t|");
        System.out.println("+---------------------------------------------------------------------------------------------------------------+");
    }

    /**
     * methode mainkan digunakan untuk memilih ingin bermain lagi atau tidak
     * @param play
     * @return play
     */
    public static boolean mainkan(boolean play) {

        // membuat object scanner
        Scanner input = new Scanner(System.in);

        // memilih ingin bermain lagi atau tidak
        System.out.println("\n");
        System.out.println("\t\t\t\t   +----------------------------+");
        System.out.println("\t\t\t\t   | Apakah ingin bermain lagi? |");
        System.out.println("\t\t\t\t   |            Ya(Y)           |");
        System.out.println("\t\t\t\t   |            No(N)           |");
        System.out.println("\t\t\t\t   |+---------------------------+");
        System.out.print("\n\t\t\t\t   Masukkan pilihan anda : ");
        
        String lanjut;
        do {
            lanjut = input.next();

            if ("N".equalsIgnoreCase(lanjut)) {
                play = false;
                break;
            }
            if ("Y".equalsIgnoreCase(lanjut)) {
                play = true;
                break;
            } else {
                System.out.println("\nAnda salah menginput");
                System.err.print("Silahkan masukkan inputan berupa (y/n) : ");
                continue;
            }
        } while (true);

        return play;
    }

    /**
     * fungsi main dari program menampilkan menu awal dan menu akhir permainan
     * @param args
     */
    public static void main(String[] args){

        // inisialisasi atribut
        boolean main = true;
        int pilihan;

        // membuat object
        MainLompatKatak bermain = new MainLompatKatak();

        // membuat object scanner
        Scanner inputPilihan = new Scanner(System.in);
        Scanner enter = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);

        /**
         * selama (boolean) play masih true maka permainan akan terus dilanjutkan
         * menu berisi pilihan rule(aturan), play(bermain), dan exit(keluar)
         * jika memilih pilihan 1 maka akan ditampilan peraturan permainan
         * jika memilih pilihan 2 maka permainan akan dimulai
         * jika memilih pilihan 3 maka akan keluar dari permainan
         */
        do{
            System.out.println("\n");
            System.out.println("\t\t===========================================================================");
            System.out.println("\t\t<===================---<      SELAMAT DATANG       >---===================>");
            System.out.println("\t\t<===================---<         DI GAME           >---===================>");
            System.out.println("\t\t<===================---< LOMPAT HAI KATAK, LOMPAT! >---===================>");
            System.out.println("\t\t===========================================================================");
            System.out.println("\n");
            System.out.println("\t\t\t\t\t+-----------------------+ ");
            System.out.println("\t\t\t\t\t|\t  Menu\t\t|");
            System.out.println("\t\t\t\t\t+-----------------------+ ");
            System.out.println("\t\t\t\t\t|\t1. Rule\t\t|");
            System.out.println("\t\t\t\t\t|\t2. Play\t\t|");
            System.out.println("\t\t\t\t\t|\t3. Exit\t\t|");
            System.out.println("\t\t\t\t\t+-----------------------+ ");

            System.out.print("\nMasukkan pilihan anda : ");
            pilihan = inputPilihan.nextInt();

            if(pilihan == 1){
                rulesGame();
                System.out.println("Tekan enter untuk lanjut...");
                enter.nextLine();
                continue;
            }else if(pilihan == 2){
                boolean play = true;
                System.out.print("\nMasukkan nama anda : ");
                String nama = inputNama.nextLine();

                do{
                    MainLompatKatak(nama);
                    play = mainkan(play);
                } while (play);

                System.out.println("Tekan enter untuk keluar...");
                enter.nextLine();
                System.out.println("\t\t<===================---< TERIMAKASIH SUDAH BERMAIN >---===================>");
                break;
            }else if(pilihan == 3){
                break;
            }else{
                System.out.println("\nAnda salah menginput");
                System.out.println("Silakan masukkan input yang benar (1/2/3)");
                System.out.println("Tekan enter untuk kembali ke Menu...");
                enter.nextLine();
                continue;
            }

        } while (true);

        inputPilihan.close();
        enter.close();
    }
} 
